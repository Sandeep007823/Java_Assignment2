import java.util.Scanner;
public class Palindrome{

	public static void main(String args[]) {
		int num,digit=0,temp=0,a=0;
		
		System.out.println("Enter a number");
		Scanner abj = new Scanner(System.in);
		num = abj.nextInt();
		temp = num;
		do {
			digit= temp%10;
			temp = temp/10;
			a = a*10 + digit;
		}
		while(temp>0);
		
		if(a == num) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
}
