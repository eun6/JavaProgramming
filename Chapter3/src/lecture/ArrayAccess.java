package lecture;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��� 5���� �Է��ϼ���.");
		int newArray[] = new int[5];
		int max = 0;
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			newArray[i] = num;
			if(newArray[i] > max) max = newArray[i];
		}
		System.out.println("���� ū ���� " + max);
		sc.close();
	}

}
