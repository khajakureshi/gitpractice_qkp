package partice;

public class reversenumber {

	public static void main(String[] args) {
		int n=1653;
		int rev=0,rem=0;
		for(int i=0;i<=n;i++) {
			 rem=n%10;
			rev=rev*10+rem;
			n/=10;
			
		}
		System.out.println(rev);
	}

}
