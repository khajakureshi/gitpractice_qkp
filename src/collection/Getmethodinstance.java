package collection;

import java.util.ArrayList;

public class Getmethodinstance {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(124);
		a1.add('a');
		a1.add("java");
		a1.add(true);
		a1.add(1);
		a1.add(true);
		a1.add(4);
		a1.add(24);
	
		for(Object obj:a1) 
			if(obj instanceof Integer) {
				
			System.out.println(obj);
		}

	}

}
