import java.util.Scanner;

public class largest_number {
     
	public static void main(String []args) {
		int first, second , third;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter three Number");
		first = obj.nextInt();
		second = obj.nextInt();
		third = obj.nextInt();
		
		if(first >= second && first >= third) {
			System.out.println("Greatest Number : "+ first);
		}
		else if(second >= first && second >= third) {
			System.out.println("Greatest Number : "+ second);
		}
		else {
			System.out.println("Greatest Number : "+ third);
		}
	}
}
