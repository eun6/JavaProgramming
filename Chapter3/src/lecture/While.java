package lecture;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���.");
		int sum = 0;
		int count = 0;
		int num = sc.nextInt();
		while(num != -1) {
			sum += num;
			count++;
			num = sc.nextInt();
		}
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		} else {
			System.out.println("������ ������ " + count + "���̸� ����� " + sum/count +  "�Դϴ�.");
		}
		sc.close();
	}

}
