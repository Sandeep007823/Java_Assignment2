import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = abc.nextInt();
        
        int originalNumber = number;
        int result = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            result += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        abc.close();
    }
}
