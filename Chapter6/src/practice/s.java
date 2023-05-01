package practice;

import java.util.*;
public class s {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num + "을 입력하면");
		
		for(int i=1; i<num+1; i++) {
			int a = i-1;
			for(int j=i-a; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println(i);
		}*/
		
		int sum =0;
		for(int i=1; i<6; i++) {
			sum += (i*i + 3*i + 1);
		}
		System.out.println(sum);
	}

}
