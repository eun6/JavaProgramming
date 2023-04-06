package lecture;

public class ArrayPassing {

	static void increase(int[] array) {
		for(int i=0; i<array.length; i++) {
			array[i]++;
		}
	}
	static void increase(int arr1, int arr2, int arr3, int arr4, int arr5) {
		for(int i=0; i<3; i++) {
			arr1++;
			arr2++;
			arr3++;
			arr4++;
			arr5++;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int v[] = {1, 2, 3, 4, 5};
		
		increase(a);
		increase(v[0], v[1], v[2], v[3], v[4]);
		
		for(int x : a) {
			System.out.print(x);
		}
		System.out.println();
		for(int y : v) {
			System.out.print(y);
		}
	}

}
