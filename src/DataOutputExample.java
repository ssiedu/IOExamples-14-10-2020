
import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DataOutputExample {

    public static void main(String[] args) throws Exception {

        //in this example we will write premitive values
        
        int code=10056;
        double sal=89600.50;
        boolean married=true;
        //to write to a file we always need FileOutputStream
        FileOutputStream fos=new FileOutputStream("g:/data/emp.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(code);
        dos.writeDouble(sal);
        dos.writeBoolean(married);
        dos.close();
        fos.close();
        System.out.println("Data Stored Successfully..........!!");
    }
}
