package lecture;

public class DoWhile {

	public static void main(String[] args) {
		char c = 'a';
		do {
			System.out.print(c);
			c = (char) (c+1);
		}while(c <= 'z');

		System.out.println();
		
		//do-while 문을 while 문으로 변경!
		char a = 'a';
		while(a !='{') {
			System.out.print(a);
			a = (char) (a+1);
		}
	}

}
