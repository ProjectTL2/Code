package DB;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DBCon {

    public DBCon() {}
    
    MongoClientURI uri  = new MongoClientURI("mongodb://elafaki:12345@ds042687.mlab.com:42687/project_tl"); 
    MongoClient client = new MongoClient(uri);
    
    //EditDoc.java
    MongoDatabase database = client.getDatabase("project_tl");
    public MongoCollection<Document> mongocollection_user = database.getCollection("users");
    public MongoCollection<Document> mongocollection_sale = database.getCollection("sales");
    public MongoCollection<Document> mongocollection_sale_loc = database.getCollection("sales_loc");
    
    //Query.java
    DB database2 = client.getDB("project_tl");
    public DBCollection dbcollection_user = database2.getCollection("users");
    
    //Images.java
    public DB db_img = client.getDB("project_tl");
}