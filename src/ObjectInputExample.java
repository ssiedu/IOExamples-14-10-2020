
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ObjectInputExample {

    public static void main(String[] args) throws Exception {
        //here we will deserialize an object. (read)
        
        FileInputStream fis=new FileInputStream("g:/data/empobj.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Emp e=(Emp) ois.readObject();
        ois.close();
        fis.close();
        e.show();
    }
}
