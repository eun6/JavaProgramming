package lecture;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 -1을 입력하세요.");
		int sum = 0;
		int count = 0;
		int num = sc.nextInt();
		while(num != -1) {
			sum += num;
			count++;
			num = sc.nextInt();
		}
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
		} else {
			System.out.println("정수의 개수는 " + count + "개이며 평균은 " + sum/count +  "입니다.");
		}
		sc.close();
	}

}
