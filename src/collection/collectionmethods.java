package collection;

import java.util.ArrayList;

public class collectionmethods {

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
		
		//remove method
		a1.remove(3.14);
		System.out.println(a1);
		//contains
		System.out.println(a1.contains(3.14));
		//addAll method
		a1.addAll(a2);
		System.out.println(a1);
		//containAll method
		System.out.println(a1.containsAll(a2));
		//remove all
		a1.removeAll(a2);
		System.out.println(a1);
		//size method
		System.out.println(a1.size());
		//isEmpty method
		System.out.println(a1.isEmpty());
	}

}

	


