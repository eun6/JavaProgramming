package pairProgramming;

import java.util.Scanner;

//����, ����, �� ����
public class Num16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		String answer = "";
		
		while(true) {
			String winner = "";
			int n = (int)(Math.random()*3);
			String computer = str[n];
			
			System.out.print("���� ���� ��!>>");
			answer = sc.nextLine();

			if(answer.equals(computer)) {
				System.out.println("����� = " + answer + " , ��ǻ�� = " + computer + ", �����ϴ�.");
			} else if (answer.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			} else {
				switch(answer) {
				case "����" :
					if(computer == str[1]) {
						winner = "��ǻ��";
						break;
					} else {
						winner = "�����";
						break;
					}
				case "����" :
					if(computer == str[2]) {
						winner = "��ǻ��";
						break;
					} else {
						winner = "�����";
						break;
					}
				case "��" :
					if(computer == str[0]) {
						winner = "��ǻ��";
						break;
					} else {
						winner = "�����";
						break;
					}
				}
				System.out.println("����� = " + answer + " , ��ǻ�� = " + computer + ", " + winner + "�� �̰���ϴ�.");
			}
			
				
			
			
			
		}
		
			
		
	}
}
