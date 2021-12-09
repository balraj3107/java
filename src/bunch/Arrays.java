package bunch;
import java.util.Scanner;
public class Arrays {

	public static void main(String[] args) {
	
		int a[] = new int[5];
//new keyword allocates memory
		 Scanner sc= new Scanner(System.in);
		for(int i =0;i<5;i++) {
			System.out.format("Enter a[%d]= ",i);
			a[i]=sc.nextInt();
			
		}
		System.out.println("\n");
		System.out.println(java.util.Arrays.toString(a));
	}

}
