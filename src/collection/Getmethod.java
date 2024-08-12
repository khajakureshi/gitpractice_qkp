package collection;

import java.util.ArrayList;

public class Getmethod {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(124);
		a1.add('a');
		a1.add("java");
		a1.add(true);
		//accessing the objects using for loop
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}

	}

}
