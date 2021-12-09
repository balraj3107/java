package bunch;

import java.util.Iterator;
import java.util.Scanner;

public class GetStudentName {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		Scanner sc = new Scanner(System.in);
		String a[] = new String[5];
		// a[0]=
		for (int i = 0; i < 5; i++) {
			System.out.println("enter student name:");
			a[i] = sc.nextLine();
		}	
		//System.out.println(java.util.Arrays.toString(a));
	    	 for (int i = 0; i < a.length; i++) {
			String Name = a[i];
			System.out.println(Name);		}
	}

}
