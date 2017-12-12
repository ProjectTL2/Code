package AppObj;

import DB.EditDoc;

public class Sale {
    User curUser;
    String title, desc, address;
    double price;
    int sale_id;

    public Sale() {}
    
    public Sale(User curUser, String title, String desc,
            double price, String address) {
        this.curUser = curUser;
        this.sale_id = CreateSaleId();
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.address = address;
        
        EditDoc newEditDoc = new EditDoc();
        newEditDoc.InsertSaleInDB(curUser.getUsername(),  sale_id, title, desc,
                price, address);
    }
    
    private int CreateSaleId() {
        return (int)(Math.random() * 1000);
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }
    
    public User getCurUser() {
        return curUser;
    }

    public void setCurUser(User curUser) {
        this.curUser = curUser;
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