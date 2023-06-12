package practice;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> AL = new ArrayList<String>();
		String Long = "";
		
		while(true) {
			System.out.print("이름 입력>");
			String name = sc.next();
			
			if (name.equals("그만")) break;
			else AL.add(name);
		}
		for(int i=0; i<AL.size(); i++) {
			System.out.print(AL.get(i) + " ");
			if (AL.get(i).length() > Long.length()) Long = AL.get(i);
		}
		System.out.println("\n가장 긴 이름은 : " + Long);
		sc.close();
	}
}
