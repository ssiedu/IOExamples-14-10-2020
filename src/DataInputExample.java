
import java.io.DataInputStream;
import java.io.FileInputStream;


public class DataInputExample {

    public static void main(String[] args) throws Exception {
        //in this example we will read premitive data using DataInputStream
        
        FileInputStream fis=new FileInputStream("g:/data/emp.txt");
        DataInputStream dis=new DataInputStream(fis);
        int v1=dis.readInt();
        double v2=dis.readDouble();
        boolean v3=dis.readBoolean();
        dis.close();
        fis.close();
        System.out.println("Emp  Code : "+v1);
        System.out.println("Emp  Sal  : "+v2);
        System.out.println("M. Status : "+v3);
        
    }
}
