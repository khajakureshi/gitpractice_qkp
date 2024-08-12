package collection;

import java.util.ArrayList;

public class ionStringDisplay {

	public static void main(String[] args)
	{
	ArrayList a1=new ArrayList();
	a1.add("nation");
	a1.add("india");
	a1.add("situation");
			for(Object object:a1){
				String s=(String)object;
				
			if((s.substring(s.length()-3)).equals("ion")) {
				System.out.println(s);
			}
		}
	}
}


