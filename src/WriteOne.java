
import java.io.FileOutputStream;


public class WriteOne {

    public static void main(String[] args) throws Exception {

        //we writing to some file
        
        //step-1 (open an output stream)
        FileOutputStream os=new FileOutputStream("e:/data/trial.txt", true);
        
        //step-2 (write the data on output stream)
      
        String s=", welcome to java world";
        byte b[]=s.getBytes();
        os.write(b);
        
        //step-3 (close the stream)
        os.close();
        
        System.out.println("Data Successfully Stored...");
        
    }
}
