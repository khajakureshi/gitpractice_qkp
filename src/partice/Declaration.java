package partice;
import java.util.Scanner;
public class Declaration {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the size of the arrays :");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the arrays elements :");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("the arrays elements sre :");
		for (int i = 0; i < size; i++) {
			System.out.println(a[i]);
			
		}
			
		}
	}


