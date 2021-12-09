package bunch;

import java.util.Scanner;

public class Min_and_Max {

	public static void main(String[] args) {
		int a[] = new int[10];
		 Scanner sc= new Scanner(System.in);
			for(int i =0;i<10;i++) {
				System.out.format("Enter a[%d]= ",i);
				a[i]=sc.nextInt();
				
			}
		int min = a[0];
		int max=a[0] ;
		for (int i = 0; i < 9; i++) {
			if (min > a[i + 1]) {
				min = a[i + 1];
			}
			else if(max < a[i + 1]) {
				max = a[i+1];
				
			}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
}
