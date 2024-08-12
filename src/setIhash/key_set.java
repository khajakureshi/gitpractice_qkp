package setIhash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class key_set {

	public static void main(String[] args) {
		HashMap a1 = new HashMap();
		a1.put(1, true);
		a1.put(2, 'a');
		a1.put(3, 45);
		a1.put(4, false);
		a1.put(5, 5.2343);
		
//		convert it into set
		Set s=a1.entrySet();
		System.out.println(s);
		Set Keyset=a1.keySet();
		System.out.println(Keyset);
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object object= (Object) itr.next();
			System.out.println(object);
			
	}

}


	}


