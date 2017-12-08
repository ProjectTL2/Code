package DB;

import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Images {
    
    public void UploadImg(String s) {
        
        DBCon x = new DBCon();
        
        try {
            String newFileName = s;
            File imageFile = new File(s);
            GridFS gfsPhoto = new GridFS(x.db_img, "photo");
            GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
            gfsFile.setFilename(newFileName);
            gfsFile.save();
        }
        catch (UnknownHostException e) {}
        catch (MongoException | IOException e) {}
    }
    
    
    
   /*
    public void SaveImg(String s) throws IOException {
        
        DBCon x = new DBCon();
        String newFileName  = "File";
        String y;
        GridFS gfsPhoto = new GridFS(x.db_img, "photo");
        GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
        imageForOutput.writeTo("C:\\File.png");
        y="C:\\File.png";
        System.out.println(imageForOutput);
        
        
    }
    */
    
   public ImageIcon ShowImg() {
        
        ImageIcon imageIcon = new ImageIcon("E:\\temp.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        return imageIcon;
   }
}