import java.util.Scanner;

public class GradeOfStudent {
  
	public static void main(String []args) {
		int marks;
		System.out.println("Enter your Marks");
		Scanner abc = new Scanner(System.in) ;
		marks = abc.nextInt();
		
		if(marks >= 80) {
			System.out.println("Grade is  " + 'A');
		}
		else if(marks >= 70 && marks < 80) {
			System.out.println("Grade is " + 'B');
		}
		else if(marks >= 60 && marks < 70) {
			System.out.println("Grade is  " + 'C');
		}
		else if(marks >= 50 && marks <= 60) {
			System.out.println("Grade is  " + 'D');
		}
		else if(marks >= 35 && marks <= 50) {
			System.out.println("Grade is  " + 'E');
		}
		else {
			System.out.println("You are Fail");
		}
	}
}
