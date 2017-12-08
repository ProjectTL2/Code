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
import java.awt.Image;
import javax.swing.ImageIcon;


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
    
    public void Saveimage() throws IOException{
    String newFileName = "File";
    GridFS gfsPhoto = new GridFS(database, "photo");
    GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
    imageForOutput.writeTo("C:\\File.png");
    System.out.println(imageForOutput);
    
    }
   public ImageIcon Showimage(){
      ImageIcon imageIcon = new ImageIcon("C:\\lol.png");
          Image image = imageIcon.getImage();
          Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
          imageIcon = new ImageIcon(newimg); 
          return imageIcon;    
   }
    
}
