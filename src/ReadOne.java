
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadOne {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //we will read the contents of some file will display it on console.
        //step-1 (open a stream)
        FileInputStream fis = new FileInputStream("e:/data/test.txt");
        //step-2 (read the data from stream)
        while (true) {
            int n=fis.read();
            if(n==-1)break;
            System.out.print((char)n);
        }
        //step-3 (close the stream)
        fis.close();
        System.out.println("\nEnd-of-Reading.............");
    }
}
