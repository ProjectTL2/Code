package DB;

import AppObj.Sale;
import AppObj.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

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
    
    public Sale[] SearchQuery(String s) {
        int i = -1;
        Sale[] sale = null;
        DBCon x = new DBCon();
        BasicDBObject queringUser = new BasicDBObject("Title", s);
        DBCursor cursor = x.dbcollection_user.find(queringUser);
        
        while (cursor.hasNext()) {
            i = i++;
            sale[i].setSale_id((int) cursor.next().get("Id"));
            sale[i].setTitle((String) cursor.next().get("Title"));
            sale[i].setDesc((String) cursor.next().get("Desc"));
            sale[i].setPrice((double) cursor.next().get("Price"));
            sale[i].setAddress((String) cursor.next().get("Address"));
            cursor.next();
        }
        
        return sale;
    }
}