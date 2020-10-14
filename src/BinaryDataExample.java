
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class BinaryDataExample {

    public static void main(String[] args) throws Exception {
        //creating one InputStream for reading
        FileInputStream fis=new FileInputStream("e:/images/mobile.png");
        //creating one OutputStream for writing
        FileOutputStream fos=new FileOutputStream("g:/data/device.png");
        
        //starting read-write operation
        
        while(true){
            int n=fis.read(); if(n==-1)break;
            fos.write(n);
        }
        System.out.println("Data Succuessfully Copied.......!");
    }
}
