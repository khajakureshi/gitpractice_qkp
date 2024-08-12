package setIhash;

import java.util.ArrayList;
import java.util.HashSet;

public class Removeduplicate {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(45);
		a1.add(45);
		a1.add(123);
		a1.add(98675);
		a1.add(4567);
		a1.add(123);
		a1.add(4567);
		System.out.println("ArrayList"+a1);
		
		HashSet<Integer> a2=new HashSet<Integer>(a1);
		System.out.println("HashSet"+a2);
		ArrayList a3 =new ArrayList(a2);
	}

}
