package partice;

public class SmallestNumInArray {
			public static void main(String[] args) {
				int a[] = {6,5,3,4,15,20};
				int b=a[0];
				for (int i = 0; i < a.length; i++) {
					if(a[i]<b) {
						
						b=a[i];
				}

			}
				System.out.println(b);
		}
}
