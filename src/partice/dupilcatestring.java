package partice;

import java.util.LinkedHashSet; 
import java.util.Set;

public  class dupilcatestring {

	public static void main(String[] args) {
		String s="java class";
		StringBuffer s1=new StringBuffer() ;
			for(int i=0;i<s.length();i++) {
				char currentchar =s.charAt(i);
				if(s1.indexOf(String.valueOf(currentchar))==-1) {
					s1.append(currentchar);
				}
			}
			System.out.println(s1.toString());
			}
} 

