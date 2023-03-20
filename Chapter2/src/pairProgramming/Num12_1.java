package pairProgramming;

import java.util.Scanner;

//+, =, *, / ������ �Է¹޾� ����ϴ� ���α׷�
//if-else ���� �̿��� Ǯ��
public class Num12_1 {

	public static void main(String[] args) {
		// 1. ������ ��ĭ���� �и��Ͽ� �Է�.
		// 2. �� �����ڿ� ���� ���.
		// 3. 0���� ������ "0���� ���� �� �����ϴ�." ���.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����>>");
		float a = sc.nextFloat();
		String op = sc.next();
		float b = sc.nextFloat();
		float sum = 0;
		sc.close();
		
		if (op.equals("+")) {
			sum = a+b;
			System.out.print(a + op + b + "�� ��� ����� " +  sum);
		} else if (op.equals("-")) {
			sum = a-b;
			System.out.print(a + op + b + "�� ��� ����� " +  sum);
		} else if (op.equals("*")) {
			sum = a*b;
			System.out.print(a + op + b + "�� ��� ����� " +  sum);
		} else if (op.equals("/")) {
			if (b==0) {
				System.out.print("0���� ���� �� �����ϴ�.");
			} else {
				sum = a/b;
				System.out.print(a + op + b + "�� ��� ����� " +  sum);
			}	
		} else {
			System.out.print("����� �� �����ڸ� �Է��ϼ���.");
		}
	}

}
