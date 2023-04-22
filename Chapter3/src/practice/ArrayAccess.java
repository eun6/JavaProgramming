package practice;

import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양수 5개를 입력하세요.");
		int[] Arr = new int[5];
		int sum = 0;
		int Max = 0;
		
		for(int i=0; i< Arr.length; i++) {
			Arr[i] = sc.nextInt();;
			if(Arr[i] < 0) continue;
			else {
				sum += Arr[i];
			}
			if (Arr[i] > Max) {
				Max = Arr[i];
			}
		}
		System.out.println("전체 합은 " + sum + "입니다.");
		System.out.println("가장 큰 수는 " + Max + "입니다.");
	}

}
