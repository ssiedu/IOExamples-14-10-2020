
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTwo {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //step-1 (open a stream)
        FileInputStream fis = new FileInputStream("e:/data/test.txt");
        //step-2 (read the data from stream)
        //creating an array of byte data type. (empty array)
        int n=fis.available();
        
        byte b[]=new byte[n];
        fis.read(b);
        //converting byte-array to string
        String str=new String(b);
        System.out.println(str);
        //step-3 (close the stream)
        fis.close();
        System.out.println("\nEnd-of-Reading.............");
    }
}
