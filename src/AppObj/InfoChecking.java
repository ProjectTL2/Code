package AppObj;

import DB.Query;
import java.util.Arrays;
import java.util.List;

public class InfoChecking {
    User curUser;
    String errormsg;
    int count;
        
    public InfoChecking (User curUser, String pass_val){
        String errormsg = "";
        this.curUser = curUser;
        
        errormsg = checkUsername(errormsg, curUser.getUsername())
                + checkPassword(errormsg, curUser.getPassword(), pass_val);
        
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
    final private List<String> nonValidChars = Arrays.asList("!", "@", "#", "$",
            "%", "^", "&", "*", "(", ")", "_", "+", "=", "{", "[", "}", "]",
            ";", ":", "'", "\"", "|", "\\", "<", ">", ".", ",", "/", "?", "`",
            "~", " ");
    
    private String checkUsername(String errormsg, String username) {
        
        if (new Query().checkIfUsrnmExists(username)) {
            count++;
            errormsg = errormsg + "\n" + count + ") " +
                    "Username already exists.";
        }
        
        if (username.length() == 0) {
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
            }
        }
        
        return errormsg;
    }
    
    private String checkPassword(String errormsg, String password, String pass_val) {
        
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
}
