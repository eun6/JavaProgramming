package lecture;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 정수를 입력하세요>> ");
		int array[] = new int[5];
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			array[i] = num;
			sum += array[i];
		}
		System.out.println("평균은 " + sum/array.length);
	}

}
