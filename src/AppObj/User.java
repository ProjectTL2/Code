package AppObj;

import DB.EditDoc;

public class User {
    String name, surname, username, password, email, bday, ph_num, afm_ep, name_ep;
    
    public User() {
        this.username = "Guest";
    }
    
    //create obj User and insert in DB, for simple users.
    public User(String username, String password, String name,
            String surname, String email, String bday, String ph_num) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.afm_ep = null;
        this.name_ep = null;
        this.bday = bday;
        this.ph_num = ph_num;
        
        EditDoc newEditDoc = new EditDoc();
        newEditDoc.InsertUserInDB(username, password, name, surname,
                email, null, null, bday, ph_num);
    }
    
    //create obj User and insert in DB, for businesses.
    public User(String username, String password, String name, String surname,
            String email, String afm_ep, String name_ep ,String bday, String ph_num) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.afm_ep = afm_ep;
        this.name_ep = name_ep;
        this.bday = bday;
        this.ph_num = ph_num;
        
        EditDoc newEditDoc = new EditDoc();
        newEditDoc.InsertUserInDB(username, password, name, surname,
                email, afm_ep, name_ep, bday, ph_num);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }

    public String getPh_num() {
        return ph_num;
    }

    public void setPh_num(String ph_num) {
        this.ph_num = ph_num;
    }

    public String getAfm_ep() {
        return afm_ep;
    }

    public void setAfm_ep(String afm_ep) {
        this.afm_ep = afm_ep;
    }

    public String getName_ep() {
        return name_ep;
    }

    public void setName_ep(String name_ep) {
        this.name_ep = name_ep;
    }
}