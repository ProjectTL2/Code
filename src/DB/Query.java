package DB;

import AppObj.Sale;
import AppObj.Sale_loc;
import AppObj.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class Query {    
    
    public boolean findIfUserExists(String username, String password) {
        DBCon x = new DBCon();
        BasicDBObject queringUser = new BasicDBObject("Username", username);
        queringUser.put("Password", password);
        DBCursor cursor = x.dbcollection_user.find(queringUser);
        
        return cursor.hasNext();
    }
    
    public boolean checkIfUsrnmExists(String username) {
        DBCon x = new DBCon();
        DBCursor cursor = x.dbcollection_user.find(new BasicDBObject("Username", username));
        
        return cursor.hasNext();
    }
    
    public User returnUser(String username) {
        DBCon x = new DBCon();
        
        User userf = new User();
        List<Document> queringUser = (List<Document>) x.mongocollection_user
            .find(new BasicDBObject("Username", username))
            .into(new ArrayList<>());
        
        for (Document every : queringUser) {
            User usert = new User();
            usert.setUsername(every.getString("Username"));
            usert.setPassword(every.getString("Password"));
            usert.setName(every.getString("Name"));
            usert.setSurname(every.getString("Surname"));
            usert.setEmail(every.getString("Email"));
            usert.setAfm_ep(every.getString("Afm_Ep"));
            usert.setName_ep(every.getString("Name_Ep"));
            usert.setBday(every.getString("Bday"));
            usert.setPh_num(every.getString("Ph_Num"));
            
            userf = usert;
        }
        return userf;
    }
    
    public boolean checkIfQueryExists(String query) {
        DBCon x = new DBCon();
        DBCursor cursor = x.dbcollection_sales.find(new BasicDBObject("Title", query));
        
        return cursor.hasNext();
    }
    
    public List<Sale> SearchQuery(String query) {
        DBCon x = new DBCon();
        List<Sale> sales = new ArrayList<>();
        List<Document> salesList = (List<Document>) x.mongocollection_sale
            .find(new BasicDBObject("Title", query))
            .into(new ArrayList<>());
        
        for (Document saleD : salesList) {
            Sale saleS = new Sale();
            saleS.setUsername(saleD.getString("User"));
            saleS.setSale_id(saleD.getInteger("Id"));
            saleS.setTitle(saleD.getString("Title"));
            saleS.setDesc(saleD.getString("Desc"));
            saleS.setPrice(saleD.getDouble("Price"));
            saleS.setAddress(saleD.getString("Address"));

            sales.add(saleS);
        }
        
        return sales;
    }
    
    public List<Sale_loc> SearchMarkers(){
        DBCon x = new DBCon();
        List<Sale_loc> Markers = new ArrayList<>();
        List<Document> Location = (List<Document>) x.mongocollection_sales_loc
            .find()
            .into(new ArrayList<>());
        
        for (Document saleloc : Location) {
            Sale_loc loc = new Sale_loc();
            loc.setLat(saleloc.getDouble("Lat"));
            loc.setLongt(saleloc.getDouble("Longt"));
            loc.setTitle(saleloc.getString("Title"));
            loc.setAddress(saleloc.getString("Address"));
            loc.setSale_id(saleloc.getInteger("Sale_Id"));
            Markers.add(loc);
        }
        return Markers;
    } 
}