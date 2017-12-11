package DB;

import org.bson.Document;

public class EditDoc {
    
    //Method to insert users in DB.
    public void InsertUserInDB(String usrnm, String psswrd, String name, String surname,
            String email, String afm_ep, String name_ep, String bday, String ph_num) {
        Document document = new Document("Username", usrnm)
        .append("Password", psswrd)
        .append("Name", name)
        .append("Surname", surname)
        .append("Email", email)
        .append("Afm_Ep", afm_ep)
        .append("Name_Ep", name_ep)
        .append("Bday", bday)
        .append("Ph_Num", ph_num);
        
        DBCon x = new DBCon();
        x.mongocollection_user.insertOne(document);
    }
    
    //Method to insert sales in DB.
    public void InsertSaleInDB(String username, int sale_id, String title,
            String desc, double price, String address) {
        Document document = new Document("User", username)
        .append("Id", sale_id)
        .append("Title", title)
        .append("Desc", desc)
        .append("Price", price)
        .append("Address", address);
        
        DBCon x = new DBCon();
        x.mongocollection_sale.insertOne(document);
    }
}