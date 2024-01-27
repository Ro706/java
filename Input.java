import java.util.InputMismatchException;
import java.util.Scanner;
public class Input{
	public static void main(String[] args){
                System.out.println("Enter a number:");
                Scanner myObj = new Scanner(System.in);
                int num = myObj.nextInt();
                System.out.println("Enter your name ");
                String name = myObj.nextLine();
                System.out.println("Enter a float number");
                float numf = myObj.nextFloat();
                }
}
