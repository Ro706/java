import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sncr = new Scanner(System.in);
		System.out.println("What is your name?");
		int x = sncr.nextInt();
		System.out.println("Hello, " + x + "!");
	}
}
