package collection;

import java.util.ArrayList;

public class retainAll {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(true);
		a1.add(10);
		a1.add(3.14);
		a1.add('a');
		System.out.println(a1);
		ArrayList a2 = new ArrayList();
		a2.add(56);
		a2.add("java");
		a2.add("false");
		a2.add(10);
		System.out.println(a2);
		//retainAll
		a1.retainAll(a2);
		System.out.println(a1);

	}

}
