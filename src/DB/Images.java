package DB;

import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.File;
import com.mongodb.MongoException;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import java.io.IOException;
import java.net.UnknownHostException;

public class Images {
    
    public void UploadImg(String filepath, String filename){
        DBCon x = new DBCon();
        try {
          String newFileName = filename;
          File imageFile = new File(filepath);
          GridFS gfsPhoto = new GridFS(x.db_img, "photo");
          GridFSInputFile gfsFile = gfsPhoto.createFile(imageFile);
          gfsFile.setFilename(newFileName);
          gfsFile.save();
          SaveImg(filename);
      }
      catch (UnknownHostException e) {} 
      catch (MongoException | IOException e) {}
    }
    
    public void SaveImg(String filename) throws IOException {
        DBCon x = new DBCon();
        String newFileName = filename;
        GridFS gfsPhoto = new GridFS(x.db_img, "photo");
        GridFSDBFile imageForOutput = gfsPhoto.findOne(newFileName);
        imageForOutput.writeTo(newfile(filename));
    }
    
    public ImageIcon ShowImg() {
        ImageIcon imageIcon = new ImageIcon("‪‪");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(120, 120,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); 
        return imageIcon;
    }
    
    private String newfile(String file) throws IOException{
        int randomNum,minimum=5,maximum=10;

        String y,x,c;
        randomNum = minimum + (int)(Math.random() * maximum);
        y = Integer.toString(randomNum);
        x=file+".jpg";
        c="directory/"+x;
        File newimage = new File("directory/"+x);
        newimage.setWritable(true);
        newimage.toPath();
        return c;
    }
}