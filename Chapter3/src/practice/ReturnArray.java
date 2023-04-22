package practice;

public class ReturnArray {
	static int[] makeArray() {
		int[] temp = {1, 2, 3, 4};
		return temp;
	}
	public static void main(String[] args) {
		int[] Arr = new int[4];
		Arr = makeArray();
		
		for(int a : Arr) {
			System.out.print(a);
		}
	}

}
