package lecture;

public class DoWhile {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c = (char) (c+1);
		}while(c <= 'z');

		System.out.println();
		
		//do-while ���� while ������ ����!
		char a = 'a';
		while(a !='{') {
			System.out.print(a);
			a = (char) (a+1);
		}
	}

}
