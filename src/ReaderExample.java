
import java.io.FileReader;


public class ReaderExample {

    public static void main(String[] args) throws Exception {
        FileReader reader=new FileReader("g:/data/info.txt");
        char ch[]=new char[20];
        reader.read(ch);
        String s=new String(ch);
        System.out.println(s);
        /*
        for(char tmp:ch){
            System.out.println(tmp);
        }
        */
        reader.close();
    }
}
