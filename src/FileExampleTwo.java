
import java.io.File;
import java.io.IOException;


public class FileExampleTwo {

    public static void main(String[] args) throws IOException {

        
        File f=new File("g:/info/testing.txt");
        boolean res=f.createNewFile();
        System.out.println(res);
        /*
        //boolean res=f.mkdir();
        //boolean res=f.delete();
        File f1=new File("g:/info/abc.txt");//file to be renamed
        File f2=new File("g:/info/xyz.txt");//new name
        boolean res=f1.renameTo(f2);
        if(res==true){
            System.out.println("Operation Success....");
        }else{
            System.out.println("Operation Failed.....");
        }
        */
    }
}
/*
    boolean mkdir()
    boolean createNewFile()
    boolean delete()
    boolean renameTo(File)
    
*/
