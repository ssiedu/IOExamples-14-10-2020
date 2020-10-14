
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//here we will preserve object
public class ObjectOutputExample {

    public static void main(String[] args) throws Exception {
        Emp emp=new Emp(111,"AAA",50000,"SoftEng");
        emp.show();
                
        //Serializing the object
        FileOutputStream fos=new FileOutputStream("g:/data/empobj.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(emp);
        oos.close(); 
        fos.close();
        System.out.println("Object Stored Successfully...............!!");
                
        
    }
}
