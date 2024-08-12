package partice;

public class inhertance1 extends inheritance {
  static  int b=20;
   public   void m2() {
	   System.out.println("end");
	   System.out.println(super.a);
		System.out.println(this.b);
   }
	public static void main(String[] args) {
	
		inhertance1 a1=new inhertance1();
	
		a1.m2();
	
	}

}
