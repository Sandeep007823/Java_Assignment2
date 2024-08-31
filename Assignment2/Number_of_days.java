import java.util.Scanner;

public class Number_of_days {
    public static void main(String []args) {
    	int month;
    	System.out.println("Enter Month");
    	Scanner abc = new Scanner(System.in);
    	month = abc.nextInt();
    	
    	switch(month) {
    	case 1:
    		System.out.println(" Month is January and 31 days");
    		break;
    	
        case 2:
		System.out.println(" Month is february and 28 days");
		break;
    	
        case 3:
    		System.out.println(" Month is March and 31 days");
    		break;
        
        case 4:
    		System.out.println(" Month is April and 30 days");
    		break;
        	
        case 5:
    		System.out.println(" Month is May and 31 days");
    		break;
        	
        case 6:
    		System.out.println(" Month is June and 30 days");
    		break;
        	
        case 7:
    		System.out.println(" Month is July and 31 days");
    		break;
        	
        case 8:
    		System.out.println(" Month is August and 31 days");
    		break;
        	
        case 9:
    		System.out.println(" Month is September and 30 days");
    		break;
        	
        case 10:
    		System.out.println(" Month is October and 31 days");
    		break;
        	
        case 11:
    		System.out.println(" Month is November and 30 days");
    		break;
        	
        case 12:
    		System.out.println(" Month is December and 31 days");
    		break;
        
    	default:
    		System.out.println("please enter number between 1 to 12");
    		break;
    	
       }
    }
}
