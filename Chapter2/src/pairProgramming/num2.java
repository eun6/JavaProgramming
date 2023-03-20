package pairProgramming;

import java.util.Scanner;

//110페이지, 실습문제 2번
public class num2 {
	public static void main(String[] args) {
		// 1. 2자리 정수(10-99사이) 입력.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("2자리수 정수 입력(10~99)>>");
			int num = sc.nextInt();
			if (num <10 || num > 99) {
				System.out.println("10~99사이의 정수만 입력하세요.");
			} else {
				// 2. 십의 자리와 1의 자리가 같은 지 비교
				// 3. 같다면 -> Yes! 아니면 No!
				int ten = num/10;
				int one = num%10;
				if (ten==one) {
					System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
					sc.close();
					break;
				} else {
					System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
					sc.close();
					break;
				}
			}
		}
	}
}
