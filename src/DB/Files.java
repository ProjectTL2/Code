package DB;

import java.io.File;public class Files {
    
    
    public File newfile(){
        int randomNum,minimum=5,maximum=10;
        
        String y,x;
        randomNum = minimum + (int)(Math.random() * maximum);
        y = Integer.toString(randomNum);
        x=y+".jpg";
        
        File newimage = new File("E:\\lol"+x);
        newimage.setWritable(true);
        newimage.toPath();
        
        return newimage;
    }   
}