package LinkedList;

import java.util.LinkedList;

public class stringArr {


	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(134);
		a1.add("Strings");
		a1.add("statics");
		for(Object list:a1) {
			if(list instanceof String) {
				String s=(String)list;
				
				if(s.charAt(0)=='s'&&s.charAt(s.length()-1)=='s') {
				System.out.println(s);
			}
		}
	}

	
	}
}

	

	
	

	

