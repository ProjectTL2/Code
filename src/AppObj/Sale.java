package AppObj;

import DB.EditDoc;

public class Sale {
    User curUser;
    String name, title, desc, address;
    double price;
    
    public Sale(User curUser, String name, String title, String desc,
            double price, String address) {
        this.curUser = curUser;
        this.name = name;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.address = address;
        
        EditDoc newEditDoc = new EditDoc();
        newEditDoc.InsertSaleInDB(curUser.getUsername(), name, title, desc,
                price, address);
    }

    public User getCurUser() {
        return curUser;
    }

    public void setCurUser(User curUser) {
        this.curUser = curUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}