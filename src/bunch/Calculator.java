package bunch;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.println("press 1 for addition"+'\n'+"press 2 for subtraction"+'\n'+"press 3 for multiplication"+'\n'+"press 4 for division");
	    int op = sc.nextInt();
	    switch(op) {
	    case(1):
	    	System.out.println(a+b);
	        break;
	    case(2):
	    	System.out.println(a-b);
	        break;
	    case(3):
	    	System.out.println(a*b);
	        break;
	    case(4):
	    	System.out.println(a/b);
	        break;    
	    }
	    
	}
	

}
