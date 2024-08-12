package setIhash;
import java.util.HashSet;
import java.util.Iterator;
public class iterateruniversal {public static void main(String[] args) {
	HashSet a1= new HashSet();
	a1.add(45);
	a1.add(123);
	a1.add(98.675);
	a1.add(true);
	a1.add('a');
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
		Object obj =itr.next();
	System.out.println(obj);
}}}

	


