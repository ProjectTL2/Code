package AppObj;

public class UserError extends Error {
    User curUser;
    
    public UserError(User newUser, User curUser, String old_pass){
        this.curUser = curUser;
        
        Error error = new Error().findErrors(newUser, curUser, old_pass);
        
        this.errormsg = error.getErrormsg();
        this.count = error.getCount();
    }
    
    public UserError(User curUser, String pass_val){
        this.curUser = curUser;
        
        Error error = new Error().findErrors(curUser, pass_val);
        
        this.errormsg = error.getErrormsg();
        this.count = error.getCount();
    }

    public User getCurUser() {
        return curUser;
    }

    public void setCurUser(User curUser) {
        this.curUser = curUser;
    }
}