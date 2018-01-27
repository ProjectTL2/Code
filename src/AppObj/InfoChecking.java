package AppObj;

import DB.Query;
import java.util.Arrays;
import java.util.List;

public class InfoChecking {
    User curUser;
    String errormsg;
        
    public InfoChecking (String errormsg, User curUser, String pass_val){
        
        this.curUser = curUser;
        
        errormsg = errormsg + checkUsername(errormsg, curUser.getUsername());
        errormsg = errormsg + checkPassword(errormsg, curUser.getPassword(), pass_val);
        
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
    
    final private List<String> nonValidChars = Arrays.asList("!", "@", "#", "$", "%", "^", "&",
            "*", "(", ")", "_", "+", "=", "{", "[", "}", "]", ";", ":", "'", "\"",
            "|", "\\", "<", ">", ".", ",", "/", "?", "`", "~", " ");
    
    private String checkUsername(String errormsg, String username) {
        
        if (new Query().checkIfUsrnmExists(username)) errormsg = errormsg + "\nUsername already exists.";
        
        if (username.length() == 0)
            errormsg = errormsg + "\nEmpty Username isn't valid.";
        
        for (String i : nonValidChars) {
            if (username.contains(i))
                errormsg = errormsg + "\nUse of special charcter " + i + " in the Username isn't valid.";
        }
        
        return errormsg;
    }
    
    private String checkPassword(String errormsg, String password, String pass_val) {
        
        if (!password.equals(pass_val) || password.equals("")) errormsg = errormsg + 
                "\nValidate the password by typing the same password twice!";
        
        if (password.contains(" ") || password.equals("")) errormsg = errormsg + 
                "\nSpaces are not allowed in the Password.";
        
        return errormsg;
    }
}
