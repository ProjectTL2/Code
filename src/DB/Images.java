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
    
    public void saveimage(String s) {
        
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
    
    public void Saveimage() throws IOException {
        
        DBCon x = new DBCon();
        
        String newFileName = "File";
        GridFS gfsPhoto = new GridFS(x.db_img, "photo");
        GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
        imageForOutput.writeTo("C:\\File.png");
        System.out.println(imageForOutput);
    }
    
   public ImageIcon Showimage() {
        ImageIcon imageIcon = new ImageIcon("D:\\Media\\PicturesHDD\\DORTMUND_SCHEDULE.jpg");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        return imageIcon;
   }
}