import java.util.Scanner;

public class fibonacci {
 
	public static void main(String []args) {
		  int a= 0 , b=1 , c , temp;
		 System.out.println("enter number");
		Scanner obj = new Scanner(System.in);
		temp = obj.nextInt();
		
		for(int i=1;i<=temp;i++) {
			System.out.print(a + " ");
		     c =a+b;
		     a = b;
		     b = c;
		}
	}
}
