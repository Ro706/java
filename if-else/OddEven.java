import java.util.Scanner;
//Write a C program to check whether the number is even or odd
public class OddEven{
	public static void main(String[] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter num:");
		int num = myObj.nextInt();
		if (num%2 == 0)
		        System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}
}	
