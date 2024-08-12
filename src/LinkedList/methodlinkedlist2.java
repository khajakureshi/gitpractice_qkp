package LinkedList;

import java.util.LinkedList;

public class methodlinkedlist2 {

	public static void main(String[] args) {
		LinkedList a1=new LinkedList();
		a1.add(134);
		a1.add(true);
		a1.add('a');
		for(Object list:a1) {
			a1.remove();
			System.out.println(a1);
		}

	}

}
