package lecture;

public class ReturnArray {
	//������ �迭�� ��ȯ�ϴ� �޼ҵ�
	static int[] makeArray() {
		int temp[] = new int[4];
		
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;	
		}return temp; //�迭 ����
	}

	public static void main(String[] args) {
		int intArray[];
		
		//�޼ҵ�κ��� �迭 ���� ����.
		intArray = makeArray();
		for(int a : intArray) {
			System.out.print(a + " ");
		}
	}

}
