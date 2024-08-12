package partice;

public class happynumber { 

	public static void main(String[] args) {
	int n=4;
	int rem=0;
	
	while(n>1) {
		int sum=0;
		while(n>0) {
			 rem=n%10;
			sum=sum+(rem*rem);
			n=n/10;
			
		}
		n=sum;
		if(n==4) {
			break;
		}
	}
	if(n==1) {
		System.out.println("happy number");
	}else {
		System.out.println("not happy number");
	}

	}

}
