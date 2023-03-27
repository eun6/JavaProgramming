package pairProgramming;

import java.util.Scanner;

//가위, 바위, 보 게임
public class Num16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		String answer = "";
		
		while(true) {
			String winner = "";
			int n = (int)(Math.random()*3);
			String computer = str[n];
			
			System.out.print("가위 바위 보!>>");
			answer = sc.nextLine();

			if(answer.equals(computer)) {
				System.out.println("사용자 = " + answer + " , 컴퓨터 = " + computer + ", 비겼습니다.");
			} else if (answer.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			} else {
				switch(answer) {
				case "가위" :
					if(computer == str[1]) {
						winner = "컴퓨터";
						break;
					} else {
						winner = "사용자";
						break;
					}
				case "바위" :
					if(computer == str[2]) {
						winner = "컴퓨터";
						break;
					} else {
						winner = "사용자";
						break;
					}
				case "보" :
					if(computer == str[0]) {
						winner = "컴퓨터";
						break;
					} else {
						winner = "사용자";
						break;
					}
				}
				System.out.println("사용자 = " + answer + " , 컴퓨터 = " + computer + ", " + winner + "가 이겼습니다.");
			}
			
				
			
			
			
		}
		
			
		
	}
}
