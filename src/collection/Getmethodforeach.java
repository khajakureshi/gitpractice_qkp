package collection;

import java.util.ArrayList;

public class Getmethodforeach {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(124);
		a1.add('a');
		a1.add("java");
		a1.add(true);
		//accessing the objects using for each loop
		for(Object obj :a1) {
			System.out.println(obj);
		}

	}

}
