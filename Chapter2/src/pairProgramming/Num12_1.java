package pairProgramming;

import java.util.Scanner;

//+, =, *, / 연산자 입력받아 계산하는 프로그램
//if-else 문을 이용한 풀이
public class Num12_1 {

	public static void main(String[] args) {
		// 1. 연산자 빈칸으로 분리하여 입력.
		// 2. 각 연산자에 따른 계산.
		// 3. 0으로 나누면 "0으로 나눌 수 없습니다." 출력.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산>>");
		float a = sc.nextFloat();
		String op = sc.next();
		float b = sc.nextFloat();
		float sum = 0;
		sc.close();
		
		if (op.equals("+")) {
			sum = a+b;
			System.out.print(a + op + b + "의 계산 결과는 " +  sum);
		} else if (op.equals("-")) {
			sum = a-b;
			System.out.print(a + op + b + "의 계산 결과는 " +  sum);
		} else if (op.equals("*")) {
			sum = a*b;
			System.out.print(a + op + b + "의 계산 결과는 " +  sum);
		} else if (op.equals("/")) {
			if (b==0) {
				System.out.print("0으로 나눌 수 없습니다.");
			} else {
				sum = a/b;
				System.out.print(a + op + b + "의 계산 결과는 " +  sum);
			}	
		} else {
			System.out.print("제대로 된 연산자를 입력하세요.");
		}
	}

}
