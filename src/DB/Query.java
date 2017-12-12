package DB;

import AppObj.Sale;
import AppObj.User;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

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
        BasicDBObject queringUser = new BasicDBObject("Username", username);
        
        DBCursor cursor = newCon.dbcollection_user.find(queringUser);
        
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
        
        List<Sale> sales = new ArrayList<Sale>();
        
        BasicDBObject queringSale = new BasicDBObject("Title", s);
        DBCursor cursor = x.dbcollection_sales.find(queringSale);
        
        while (cursor.hasNext()) {
            DBObject cur = cursor.next();
            
            BasicDBList salesList = (BasicDBList) cur.get("sales");
            for (int i = 0; i <= salesList.size(); i++) {
                BasicDBObject salesObj = (BasicDBObject) salesList.get(i);
                int Sale_id = salesObj.getInt("Id");
                String Title = salesObj.getString("Title");
                String Desc = salesObj.getString("Desc");
                String Address = salesObj.getString("Address");
                
                Sale sale = new Sale();
                sale.setSale_id(Sale_id);
                sale.setTitle(Title);
                sale.setDesc(Desc);
                sale.setAddress(Address);
                
                sales.add(sale);
            }
        }
        
        return sales;
    }
}