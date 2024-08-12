package interviewprograms;

public class Array2largestNumber {
	public static void main(String[] args) {
		int a[] = {53,67,29,78,82,92,39};//
		
		int max =a[0];// 67
		int max2 = a[1]; //78
		
		for(int i=0; i<=a.length-1; i++) { // i = 4 ; i < 6; i++
			if(a[i]>max) { //78 > 53
				max2=max; // 78
				max=a[i]; //78
			}else if(a[i]>max2 && a[i] != max) { // 29 > 67 && 53 != 53
			max2=a[i];
		}
		}
		
		//System.out.println(max);
		System.out.println(max2);
		

}
}
