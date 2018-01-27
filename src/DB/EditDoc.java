package DB;

import AppObj.Sale;
import AppObj.User;
import GeoLoc.Geocode;
import com.mongodb.BasicDBObject;
import org.bson.Document;

public class EditDoc {
    
    //Method to insert users in DB.
    public void InsertUserInDB(User curUser) {
        
        DBCon x = new DBCon();
        
        Document document = new Document("Username", curUser.getUsername())
        .append("Password", curUser.getPassword())
        .append("Name", curUser.getName())
        .append("Surname", curUser.getSurname())
        .append("Email", curUser.getEmail())
        .append("Bday", curUser.getBday())
        .append("Ph_Num", curUser.getPh_num())
        .append("Is_Ep", curUser.getIs_ep())
        .append("Afm_Ep", curUser.getAfm_ep())
        .append("Name_Ep", curUser.getName_ep());
        
        x.mongocollection_user.insertOne(document);
    }
    
    //Method to insert sales in DB and sales location.
    public void InsertSaleInDB(Sale newSale) {
        
        DBCon x = new DBCon();
        
        Document document = new Document("User", newSale.getUsername())
        .append("Id", newSale.getSale_id())
        .append("Title", newSale.getTitle())
        .append("Desc", newSale.getDesc())
        .append("Price", newSale.getPrice())
        .append("Address", newSale.getAddress());
        
        new Geocode().InsertLatLongDB(newSale.getTitle(), newSale.getAddress(), 
                newSale.getSale_id());
        
        x.mongocollection_sale.insertOne(document);
    }
    
    public void deleteUser(String usernm){
        DBCon x = new DBCon();
        
        x.dbcollection_user.remove(
                new BasicDBObject().append("Username", usernm));
    }
    
    public void updateUser(User user, User newuser){
        DBCon x = new DBCon();
        
        BasicDBObject query = new BasicDBObject().append("Username", user.getUsername());
        
        x.dbcollection_user.update(query,
                new BasicDBObject().append("Username", newuser.getUsername())
                .append("Password", newuser.getPassword())
                .append("Name", newuser.getName())
                .append("Surname", newuser.getSurname())
                .append("Email", newuser.getEmail())
                .append("Is_Ep", newuser.getIs_ep())
                .append("Afm_Ep", newuser.getAfm_ep())
                .append("Name_Ep", newuser.getName_ep())
                .append("Bday", newuser.getBday())
                .append("Ph_Num", newuser.getPh_num()));
    }
}