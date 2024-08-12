package setIhash;

import java.util.HashMap;

public class MapMethods {

	public static void main(String[] args) {
		HashMap a1 = new HashMap();
		a1.put(1, true);
		a1.put(2, 'a');
		a1.put(3, 45);
		a1.put(4, false);
		a1.put(5, 5.2343);
		System.out.println(a1);
		System.out.println(a1.isEmpty());
		System.out.println(a1.size());
		System.out.println(a1.containsKey(2));
		System.out.println(a1.containsValue(true));
		System.out.println(a1.get(4));
		System.out.println(a1.remove(false));

	}

}
