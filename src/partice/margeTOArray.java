package partice;

public class margeTOArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4 };
		int arr2[] = { 6, 7, 8, 9,};
		int arr1l = arr1.length;
		int arr2l = arr2.length;
		int arr3l = arr1l + arr2l;
		int[] arr3 = new int[arr3l];
		for (int i = 0; i < arr1l; i = i + 1) {
			arr3[i] = arr1[i];
		}
		for (int i = 0; i < arr1l; i = i + 1) {
			arr3[arr1l + i] = arr2[i];
		}
		for (int i = 0; i < arr3.length; i = i + 1) {

			System.out.println(arr3[i]);
		}
	}
}
