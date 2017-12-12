package DB;

import AppObj.Sale;
import AppObj.User;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class Query {    
    
    public boolean findIfUserExists(String username, String password) {
        DBCon newCon = new DBCon();
        BasicDBObject queringUser = new BasicDBObject("Username", username);
        queringUser.put("Password", password);
        DBCursor cursor = newCon.dbcollection_user.find(queringUser);
        
        return cursor.hasNext();
    }
    
    public boolean checkIfUsrnmExists(String username) {
        DBCon newCon = new DBCon();
        
        DBCursor cursor = newCon.dbcollection_user.find(new BasicDBObject("Username", username));
        
        return cursor.hasNext();
    }
    
    public User returnUser(String username) {
        User userf = new User();
        BasicDBObject queringUser = new BasicDBObject("Username", username);
        
        userf.setUsername((String) queringUser.get("Username"));
        userf.setPassword((String) queringUser.get("Password"));
        userf.setName((String) queringUser.get("Name"));
        userf.setSurname((String) queringUser.get("Surname"));
        userf.setEmail((String) queringUser.get("Email"));
        userf.setAfm_ep((String) queringUser.get("Afm_Ep"));
        userf.setName_ep((String) queringUser.get("Name_Ep"));
        userf.setBday((String) queringUser.get("Bday"));
        userf.setPh_num((String) queringUser.get("Ph_Num"));
        return userf;
    }
    
    public List<Sale> SearchQuery(String s) {
        DBCon x = new DBCon();
        List<Sale> sales = new ArrayList<>();
        List<Document> salesList = (List<Document>) x.mongocollection_sale
            .find(new BasicDBObject("Title", s))
            .into(new ArrayList<>());
        
        for (Document saleD : salesList) {
            Sale saleS = new Sale();
            saleS.setSale_id(saleD.getInteger("Id"));
            saleS.setTitle(saleD.getString("Title"));
            saleS.setDesc(saleD.getString("Desc"));
            saleS.setPrice(saleD.getDouble("Price"));
            saleS.setAddress(saleD.getString("Address"));

            sales.add(saleS);
        }
        
        return sales;
    }
}