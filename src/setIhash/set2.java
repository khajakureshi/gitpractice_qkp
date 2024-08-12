package setIhash;

import java.util.HashSet;
import java.util.Iterator;

public class set2 {

	public static void main(String[] args) {
		
			HashSet a1= new HashSet();
			a1.add(45);
			a1.add(123);
			a1.add(98.675);
			a1.add(true);
			a1.add('a');
			Iterator itr=a1.iterator();
			while(itr.hasNext()) {
				Object obj =itr.next();
				if(obj instanceof Integer) {
			System.out.println(obj);
			}
			
				else {
					itr.remove();
				}
			}
			System.out.println(a1);
	}

}
