import java.util.Scanner;

public class table {
 
	public static void main(String []args) {
		int number;
		System.out.println("Enter Number");
		Scanner abc = new Scanner(System.in);
		 number = abc.nextInt();
		for(int i = 1;i<= 10;i++) {
			System.out.println(number + " * "+ i + " = " + number * i);
		}
	}
}