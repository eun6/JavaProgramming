package lecture;

import java.util.Scanner;
public class ForEach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = { 1,2,3,4,5 };
		String names[] = { "���", "��", "�ٳ���", "ü��", "����", "����" };
	
		int sum = 0;
		for(int a : n) {
			System.out.print(a + " ");
			sum += a;
		}
		System.out.println("���� "+ sum);
	}
}
