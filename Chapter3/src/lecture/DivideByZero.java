package lecture;

import java.util.Scanner;

public class DivideByZero {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int dividend; // ������
	int divisor; // ������
	
	while(true) {
		System.out.print("�������� �Է��Ͻÿ�:"); 
		dividend = scanner.nextInt(); // ������ �Է�
		System.out.print("�������� �Է��Ͻÿ�:"); 
		divisor = scanner.nextInt(); // ������ �Է�
		try {
			System.out.println(dividend + "�� "+ divisor + "�� ������ ����" + dividend/divisor + "�Դϴ�.");
			break; // �������� ������ �Ϸ� �� while �����
		} catch(ArithmeticException e) { // ArithmeticException ���� ó�� �ڵ�
			System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���");
		}
	}
	scanner.close();
	}
}
