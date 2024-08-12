package setIhash;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class stringhashlinkedset {

	public static void main(String[] args) {
	
		String s="I am am good";
		String a[]=s.split(" ");
		List<String> a1=Arrays.asList(a);
		System.out.println(a1);
		 LinkedHashSet<String> l1= new LinkedHashSet<String>(a1);
		
		System.out.println(l1);
		String newString="";
		for(String str:l1) {
			newString=newString+str;
			if(l1.size()-1<l1.size()) {
				newString=newString+" ";
				
			}
		}
		System.out.println(newString);
	}



	}


