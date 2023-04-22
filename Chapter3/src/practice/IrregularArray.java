package practice;

public class IrregularArray {

	public static void main(String[] args) {
		int[][] Arr = new int[4][];
		
		for(int i=0; i < Arr.length; i++) {
			if (i == 1 || i == 3) {
				Arr[i] = new int [2];
			} else Arr[i] = new int [3];
		}
		for (int i=0; i< Arr.length; i++) {
			for(int j=0; j<Arr[i].length; j++) {
				Arr[i][j] = (i+1) * 10 + j;
				System.out.print(Arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
