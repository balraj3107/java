
package bunch;

public class Loops {
	public static void main(String[] args) {
		/*
		 * for(statement1;conditionalstatement;statement3){ }
		 */
		int stars = 5,k=1;
		
		for (int a = 1; a <= (stars * stars ); a++) {

			System.out.print("* ");
			if (a % (stars) == 0) {
                a+=k;
                k++;
				System.out.print('\n');
				
			}
		

		}
		int star = 5;
		for (int a = 1; a <= (star * star); a++) {
			System.out.print("* ");
			if (a % star == 0)
				System.out.println("");
		}
		System.out.println("\n\n");
		int c = 1;

		for (int a = 1; a <= (star * star); a++) {
			System.out.print("* ");
			// System.out.print(c);
			if (a % star == 0) {
				a += c;
				c++;
				System.out.println("");
			}

		}
		System.out.println("\n\n");
		int n = (star * (star + 1)) / 2;
		int count = 0, d = star;
		for (int a = 1; a <= n; a++) {
			System.out.print("* ");
			count++;
			// System.out.print(count);
			if (count % d == 0) {
				d--;
				count = 0;
				System.out.println("");
			}
		}//Homework Q1
		System.out.println("\n\n");
		int b = 1, temp = 1;
		for (int a = 1; a <= n; a++) {
			System.out.print("* ");
			temp++;

			if (temp % b == 0) {
				b++;
				temp = 0;
				System.out.println("");
			}
		}//homework Q2
		System.out.println("\n\n");
	
		int x=star;
		int tmp=star+1;
		int y=0;
		int m=0;
		
		for(int i=1;i<=(star*star);i++)
		{
		    if(i>m)
		    System.out.print("*");
		    else
		    System.out.print(" ");
		    if(i%star==0)
		    {
		        
		        y++;
		        m=tmp*y;
		        x=x+star-1;
		  
		    System.out.println();
		        
		    }
		    
		}

	}

}