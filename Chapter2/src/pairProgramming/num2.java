package pairProgramming;

import java.util.Scanner;

//110������, �ǽ����� 2��
public class num2 {
	public static void main(String[] args) {
		// 1. 2�ڸ� ����(10-99����) �Է�.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
			int num = sc.nextInt();
			if (num <10 || num > 99) {
				System.out.println("10~99������ ������ �Է��ϼ���.");
			} else {
				// 2. ���� �ڸ��� 1�� �ڸ��� ���� �� ��
				// 3. ���ٸ� -> Yes! �ƴϸ� No!
				int ten = num/10;
				int one = num%10;
				if (ten==one) {
					System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
					sc.close();
					break;
				} else {
					System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
					sc.close();
					break;
				}
			}
		}
	}
}
