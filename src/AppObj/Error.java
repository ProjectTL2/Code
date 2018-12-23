package AppObj;

import DB.Query;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//a

public class Error {
    Sale newSale;
    int count;
    String errormsg;
    final private String numericals = "0123456789";
    final private List<String> nonValidChars = Arrays.asList("`", "~", "!", "@",
            "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[",
            "{", "]", "}", ";", ":", "'", "\"", "\\", "|", ",", "<", ".", ">",
            "/", "?", " ");
    
    //<editor-fold defaultstate="collapsed" desc="Constructors, Getter & Setter">
    public Error() {}
    public Error(String errormsg, int count) {
        this.errormsg = errormsg;
        this.count = count;
    }
    public Error(String errormsg, int count, Sale newSale) {
        this.newSale = newSale;
        this.errormsg = errormsg;
        this.count = count;
    }
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Update Checks">
    public Error findErrors(User newUser, User curUser, String old_pass) {
        String errormsg = checkUsername(newUser.getUsername(), curUser.getUsername())
                + checkName(newUser.getName(), newUser.getSurname())
                + checkEmail(newUser.getEmail())
                + checkBday(newUser.getBday())
                + checkPh_num(newUser.ph_num);
        if (!old_pass.equals("")) errormsg = errormsg +
                checkPassword(curUser.getPassword(), newUser.getPassword(), old_pass);
        return new Error(errormsg, count);
    }
    
    private String checkUsername(String newUsername, String oldUsername) {
        String errormsg = "";
        
        if (!oldUsername.equals(newUsername)) {
            if (new Query().checkIfUsrnmExists(newUsername)) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "Username already exists.";
            }

            if (newUsername.equals("")) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "Empty Username isn't valid.";
            }

            for (String i : nonValidChars) {
                if (newUsername.contains(i)) {
                    count++;
                    errormsg = errormsg + "\n" + count + ") " +
                            "Use of special charcters like \"" + i +
                            "\" in the Username isn't valid.";
                    break;
                }
            }
        }
        
        return errormsg;
    }
    
    private String checkPassword(String password, String newpass, String oldpass) {
        String errormsg = "";
                
        if (!password.equals(oldpass)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Validate the password by typing it twice.";
        }
        
        if (newpass.equals("")) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Empty Password isn't valid.";
        }
        
        if (newpass.contains(" ")) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Spaces are not allowed in the Password.";
        }
        
        return errormsg;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="SignUp Checks">
    public Error findErrors(User curUser, String pass_val) {
        String errormsg = checkUsername(curUser.getUsername())
                + checkPassword(curUser.getPassword(), pass_val)
                + checkName(curUser.getName(), curUser.getSurname())
                + checkEmail(curUser.getEmail())
                + checkBday(curUser.getBday())
                + checkPh_num(curUser.ph_num);
        return new Error(errormsg, count);
    }
        
    private String checkUsername(String username) {
        String errormsg = "";
        
        if (new Query().checkIfUsrnmExists(username)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Username already exists.";
        }
        
        if (username.equals("")) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Empty Username isn't valid.";
        }
        
        for (String i : nonValidChars) {
            if (username.contains(i)) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "Use of special charcters like \"" + i +
                        "\" in the Username isn't valid.";
                break;
            }
        }
        
        return errormsg;
    }
    
    private String checkPassword(String password, String pass_val) {
        String errormsg = "";
                
        if (!password.equals(pass_val)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Validate the password by typing it twice.";
        }
        
        if (password.equals("")) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Empty Password isn't valid.";
        }
        
        if (password.contains(" ")) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Spaces are not allowed in the Password.";
        }
        
        return errormsg;
    }
    
    private String checkName(String name, String surname) {
        String errormsg = "";        
        
        if (name.equals("") || surname.equals("")) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Empty Name isn't valid.";
        }
        
        for (String i : nonValidChars) {
            if (name.contains(i) || surname.contains(i)) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "Use of special charcters like \"" + i +
                        "\" in the Name isn't valid.";
                break;
            }
        }
        
        String[] listNumericals = numericals.split("");
        for (String i : listNumericals) {
            if (name.contains(i) || surname.contains(i)) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "Use of numbers in the Name isn't valid.";
                break;
            }
        }
        
        return errormsg;
    }
    
    private String checkEmail(String email) {
        String errormsg = "";
        
        Pattern pat = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher mat = pat.matcher(email);
        boolean matFound = mat.matches();
        if (!matFound) {
            count++;
            errormsg = errormsg + "\n" + count + ") " + email +
                    " doesn't look like an e-m@il.";
        }
        
        return errormsg;
    }
    
    private String checkBday(String bday) {
        String errormsg = "";
        
        if (!checkIfStringIsInt(bday)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " + 
                    "A year only contains numbers";
        }
        else {
            if (bday.length() != 4) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "A year has 4 numbers (at the moment) this \"" + bday +
                        "\" doesn't.";
            }

            int intBday = Integer.parseInt(bday);
            int curYear = Calendar.getInstance().get(Calendar.YEAR);
            if (intBday > curYear-16 || intBday < curYear-100) {
                count++;
                errormsg = errormsg + "\n" + count + ") " +
                        "Minors, mummies and time travelers shall not pass.";
            }
        }
        
        return errormsg;
    }
    
    private String checkPh_num(String phone) {
        String errormsg = "";
        
        if (!checkIfStringIsInt(phone)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Phone numbers contain only numbers.";
        }
        else if(phone.length() != 10) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Phone numbers must contain 10 numbers.";
        }
        
        return errormsg;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="AddSale Checks">
    public Error findErrors(Sale newSale){        
        newSale.setSale_id(createId(newSale.getSale_id()));
        if (newSale.getSale_id() == -1) return new Error(" Unable to create new sale,\nplease try again later.",
                -1, newSale);
        
        String errormsg = checkTitle(newSale.getTitle())
                + checkDesc(newSale.getDesc())
                + checkPrice(String.valueOf(newSale.getPrice()));
        
        return new Error(errormsg, count, newSale);
    }
    
    private int createId(int id) {
        int count = 0;
        
        while (new Query().checkIfSale_IdExists(id) && count <= 1000) {
            count++;
            id = (int) (Math.random() * 9999);
        }
        if (count > 1000) id = -1;
        
        return id;
    }
    
    private String checkTitle(String title) {
        String errormsg = "";
        
        if (title.length() < 5 || title.length() > 15) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Title must >5 & 16>.";
        }
        
        return errormsg;
    }
    
    private String checkDesc(String desc) {
        String errormsg = "";
        
        if (desc.length() < 5 || desc.length() > 20) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Description of products mustn't exceed 20 characters nor should it be less than 5.";
        }
        
        return errormsg;
    }
    
    private String checkPrice(String price) {
        String errormsg = "";
        
        if (!checkIfStringIsPrice(price)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "A price can only contain numbers, you can use \".\" as seperator.";
        }
        
        return errormsg;
    }
    //</editor-fold>
    
    private boolean checkIfStringIsInt(String string) {
        String[] listString = string.split("");
        String[] listNumericals = numericals.split("");
        
        for (String i : listString) {
            for (String j : listNumericals) {
                if (i.equals(j)) break;
                else if (j.equals(numericals.substring(numericals.length()-1)))
                    return false;
            }
        }
        return true;
    }
    
    private boolean checkIfStringIsPrice(String string) {
        if (checkIfStringIsInt(string)) return true;
        String[] listString = string.split("");
        for (String i : listString) {
            for (String j : nonValidChars) {
                if (j.equals(i) && !j.equals(".")) return false;
            }
        }
        return true;
    }
}