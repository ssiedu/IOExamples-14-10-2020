
import java.util.Scanner;


public class KBInputExample {

    public static void main(String[] args) {

        //reading the inputs from keyboard
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Roll Number : ");
        int rno=sc.nextInt();
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        System.out.println("Enter Your Percentage : ");
        double per=sc.nextDouble();
        System.out.println("___________________________________________");
        System.out.println("Your Details : ");
        System.out.println(rno);
        System.out.println(name);
        System.out.println(per);
    }
}
/*
*/
