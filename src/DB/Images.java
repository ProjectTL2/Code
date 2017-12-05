package DB;


import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

/**
 *
 * @author ΣΤΕΛΙΟΣ
 */
public class Images {
      
    MongoClientURI uri  = new MongoClientURI("mongodb://elafaki:12345@ds042687.mlab.com:42687/project_tl"); 
    MongoClient client = new MongoClient(uri);
    DB database = client.getDB("project_tl");
    DBCollection collection = database.getCollection("dummyColl");
    
    public void saveimage(String s){
        try{
                   String newFileName = s;
                   File imageFile = new File(s);
                   GridFS gfsPhoto = new GridFS(database, "photo");
                   GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
                   gfsFile.setFilename(newFileName);
                   gfsFile.save();}
                     catch (UnknownHostException e) {
			e.printStackTrace();
		      } catch (MongoException e) {
			e.printStackTrace();
		     } catch (IOException e) {
			e.printStackTrace();
		    }
        

    }
    
    public void Showimage() throws IOException{
    String newFileName = "Image6";
    GridFS gfsPhoto = new GridFS(database, "photo");
    GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
    imageForOutput.writeTo("E:\\LoxaxaxaL.png");
    System.out.println(imageForOutput);
    
    }
   
    
}
