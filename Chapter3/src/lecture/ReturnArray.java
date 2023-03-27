package lecture;

public class ReturnArray {
	//정수형 배열을 반환하는 메소드
	static int[] makeArray() {
		int temp[] = new int[4];
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;	
		}return temp; //배열 리턴
	}

	public static void main(String[] args) {
		int intArray[];
		
		//메소드로부터 배열 전달 받음.
		intArray = makeArray();
		for(int a : intArray) {
			System.out.print(a + " ");
		}
	}

}
