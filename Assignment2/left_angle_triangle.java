import java.util.Scanner;

public class left_angle_triangle {

	public static void main(String []args) {
		int num;
		System.out.println("Enter Number");
		Scanner xy = new Scanner(System.in);
		num = xy.nextInt();
		for(int i= 1; i<= num;i++) {
			for(int j=num-i;j >= 1;j--) {
			System.out.print(" ");
		} 
			for(int k=1;k <= i ;k++) {
		     System.out.print("*");
		}
			System.out.println();
		}
		xy.close();
	}
}

