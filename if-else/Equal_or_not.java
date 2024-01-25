//. Write a C program to accept two integers and check whether they are equal or not.
import java.util.Scanner;
public class  Equal_or_not{
	public static void main(String[] args){
	Scanner myObj = new Scanner(System.in);
	System.out.print("Enter a num 1: ");
	int num1 = myObj.nextInt();
        System.out.print("Enter a num 2: ");
        int num2 = myObj.nextInt();
        if (num1 == num2)
		System.out.println("YES given number is equal");
	else
		System.out.println("No given number is not equal");
	}
}	
