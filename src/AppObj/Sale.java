package AppObj;

public class Sale {
    String user, title, desc, address, price;
    int sale_id;

    public Sale() {}
    
    public Sale(String user, String title, String desc,
            String price, String address) {
        this.user = user;
        this.sale_id = 0;
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.address = address;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public String getUsername() {
        return user;
    }

    public void setUsername(String user) {
        this.user = user;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}