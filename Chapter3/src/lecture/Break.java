package lecture;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.print(">>");
			String word = sc.nextLine();
			if(word.equals("exit")) break;
		}
		System.out.println("�����մϴ�...");
	}

}
