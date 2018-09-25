
package inputscanner;
import java.util.Scanner;

public class InputScanner {


    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter some numbers:");
        Scanner input=new Scanner(System.in);
        a=input.nextInt();
        b=input.nextInt();
        System.out.println("Entered numbers are:"+a);
        System.out.println("Entered numbers are:"+b);
    }
    
}
