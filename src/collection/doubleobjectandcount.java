package collection;

import java.util.ArrayList;

public class doubleobjectandcount {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(124.23);
		a1.add(123.123);
		a1.add(12.41);
		a1.add("java");
		int count=0;
		for(Object object :a1){
			if(object instanceof Double){
				System.out.println(object);}
			else if(object instanceof String) {
				count++;
		}	
		}
		System.out.println(count);
	}
	}
