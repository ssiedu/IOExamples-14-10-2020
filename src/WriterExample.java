
import java.io.FileWriter;


public class WriterExample {

    public static void main(String[] args) throws Exception {

        //in this example we will try methods belongs to Writer
        FileWriter writer=new FileWriter("g:/data/info.txt");
        String s="this is java code and we are testing writer methods";
        writer.write(s,10,30);
        //writer.write("indore");
        //writer.write("delhi");
        //writer.write("mumbai");
        writer.close();
        System.out.println("Data Stored.............!!");
        
    }
}
