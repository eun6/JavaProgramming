package lecture;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5���� ������ �Է��ϼ���>> ");
		int array[] = new int[5];
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			array[i] = num;
			sum += array[i];
		}
		System.out.println("����� " + sum/array.length);
	}

}
