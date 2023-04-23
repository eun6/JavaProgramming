package practice;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나뉨수를 입력하시오:");
		int num1 = sc.nextInt();
		
		System.out.println("나눗수를 입력하시오:");
		int num2 = sc.nextInt();
		
		try {
			System.out.println(num1 + "을 " + num2 + "로 나누면 몫은 " + num1/num2 + "입니다.");
		}
		catch(Exception e) {
			System.out.println("계산 오류가 발생했습니다.");
		}
		
	}

}
