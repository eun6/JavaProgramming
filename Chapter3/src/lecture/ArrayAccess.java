package lecture;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요.");
		int newArray[] = new int[5];
		int max = 0;
		
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			newArray[i] = num;
			if(newArray[i] > max) max = newArray[i];
		}
		System.out.println("가장 큰 수는 " + max);
		sc.close();
	}

}
