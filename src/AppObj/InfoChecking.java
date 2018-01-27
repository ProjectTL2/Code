package AppObj;

import DB.Query;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoChecking {
    User curUser;
    String errormsg;
    int count;
        
    public InfoChecking (User curUser, String pass_val){
        String errormsg;
        this.curUser = curUser;
        
        errormsg = checkUsername(curUser.getUsername())
                + checkPassword(curUser.getPassword(), pass_val)
                + checkName(curUser.getName(), curUser.getSurname())
                + checkEmail(curUser.getEmail());
        
        this.errormsg = errormsg;
    }

    public User getCurUser() {
        return curUser;
    }

    public void setCurUser(User curUser) {
        this.curUser = curUser;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    //
    //-------!CHECKS!---------
    //
    final private List<String> nonValidChars = Arrays.asList("`", "~", "!", "@",
            "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "=", "+", "[",
            "{", "]", "}", ";", ":", "'", "\"", "\\", "|", ",", "<", ".", ">",
            "/", "?", " ");
    
    final private List<String> numericals = Arrays.asList("0", "1", "2", "3",
            "4", "5", "6", "7", "8", "9");
    
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
        
        if (password.contains(" ") && !password.equals("")) {
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
        
        for (String i : numericals) {
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
                    " this doesn't look like an e-m@ail :(";
        }
        
        return errormsg;
    }
}
