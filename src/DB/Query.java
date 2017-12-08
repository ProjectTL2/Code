package DB;

import AppObj.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Query {
    
    MongoClientURI uri  = new MongoClientURI("mongodb://elafaki:12345@ds042687.mlab.com:42687/project_tl"); 
    MongoClient client = new MongoClient(uri);
    
    
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
}