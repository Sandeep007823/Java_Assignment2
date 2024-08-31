
import java.util.Scanner;

public class right_angle_triangle {

	public static void main(String []args) {
		int num;
		System.out.println("Enter Number");
		Scanner xy = new Scanner(System.in);
		num = xy.nextInt();
		for(int i= 1;i<= num;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
