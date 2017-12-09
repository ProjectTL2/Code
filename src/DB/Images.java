package DB;

import com.mongodb.Block;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.bson.Document;
import org.bson.types.ObjectId;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.mongodb.client.gridfs.model.GridFSUploadOptions;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Images {
    
    public void UploadImg(String filePath,String fileName) {
        
         MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
         ObjectId fileId = null;
        
        try {
           MongoDatabase database = mongoClient.getDatabase("photo");
           GridFSBucket gridBucket = GridFSBuckets.create(database);
           InputStream inputStream = new FileInputStream(new File(filePath));
           GridFSUploadOptions uploadOptions = new GridFSUploadOptions().chunkSizeBytes(1024).metadata(new Document("type", "image").append("content_type", "image/jpg"));
           fileId = gridBucket.uploadFromStream(fileName, inputStream,uploadOptions);
           
        }
       catch (Exception e) {
        e.printStackTrace();
  }
    }
    
      
         public void SaveImg(String fileName) {
             
             
             
            
             MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
              try {
   MongoDatabase database = mongoClient.getDatabase("photo");
   GridFSBucket gridBucket = GridFSBuckets.create(database);
   
   gridBucket.find().forEach(new Block<GridFSFile>()
      {
   @Override
   public void apply( GridFSFile gridFSFile ) {
       try {
           
           FileOutputStream fileOutputStream = new FileOutputStream(new Files().newfile());
           gridBucket.downloadToStream(fileName, fileOutputStream);
           fileOutputStream.close();
       } catch (IOException ex) {
           Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
       }

   }
   });
 
  } catch (Exception e) {
   e.printStackTrace();
  } 
    }
    
    
    
     public ImageIcon ShowImg() {
        
        ImageIcon imageIcon = new ImageIcon("E:\\lol.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        return imageIcon;
   }
}