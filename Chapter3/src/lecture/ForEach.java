package lecture;

import java.util.Scanner;
public class ForEach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] n = { 1,2,3,4,5 };
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도" };
	
		int sum = 0;
		for(int a : n) {
			System.out.print(a + " ");
			sum += a;
		}
		System.out.println("합은 "+ sum);
	}
}
