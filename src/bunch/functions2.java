package bunch;

import java.util.Scanner;

public class functions2 {
	static void getStudentname() {
		Scanner sc = new Scanner(System.in);
		String a[] = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("enter student name:");
			a[i] = sc.nextLine();
		}
	    	 for (int i = 0; i < a.length; i++) {
			String Name = a[i];
			System.out.println(Name);		}

}
}