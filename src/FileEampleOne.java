
import java.io.File;


//this example will demonstrate the usage of File class methods


public class FileEampleOne {
    public static void main(String[] args) {
        //File f=new File("g:/info/trial.txt");
        File f=new File("c:/windows");
        String ar[]=f.list();
        for(String item:ar){
            System.out.println(item);
        }
        /*
        long time=f.lastModified();
        java.util.Date dt=new java.util.Date(time);
        System.out.println(time);
        System.out.println(dt);
        */
        //boolean res=f.isHidden();
        //boolean res=f.canWrite();
        //System.out.println(res);
        /*
        if(f.exists()){
            if(f.isFile()){
                long val=f.length();
                System.out.println(val);
            }else{
                System.out.println("Its A Folder");
            }
        }else{
           System.out.println("Not Available....."); 
        }
        */
    }
}
/*
    File(non-static)
    String[] list()         //it gives you contains of a folder

    long lastModified()     //give you the time when this file was last time modified   
                            (no of milli-seconds that have passed from 1st jan, 1970 mid-night to modification
    boolean canWrite();     //true , if you have permissions to write to a file (not read-only)
    boolean isHidden();     //true  , it is hidden file
    long length()
    boolean exists()
    boolean isFile()        //is check whether the given path is a file or not.
    boolean isDirectory()   //true=>if it is a directory otherwise => false
*/
