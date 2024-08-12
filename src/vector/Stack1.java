package vector;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack a1= new Stack();
		a1.add(24);
		a1.add(true);
		a1.add("shadow");
		a1.add('@');
		a1.add(123.34);
		
		
		a1.push(22);
		System.out.println(a1);
		a1.pop();
		System.out.println(a1);
		 System.out.println(a1.peek());
		 System.out.println(a1.search(true));

	}

	
		
	}


