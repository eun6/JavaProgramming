package pairProgramming;

import java.util.Scanner;

class Phone {
	String name;
	String tel;
	
	public Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void show() {
		System.out.println(name + "의 번호는 " + tel + " 입니다.");
	}
}

public class Num_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수>>");
		int num = sc.nextInt();
		Phone[] p = new Phone[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
			String user = sc.next();
			String tel = sc.next();
			p[i] = new Phone(user, tel);
		}
		System.out.println("저장되었습니다...");
		
		while(true) {
			boolean found = false;
			System.out.print("검색할 이름>>");
			String search = sc.next();
			
			if (search.equals("그만")) break;
			for(Phone a : p) {
				if (a.name.equals(search)) {
					a.show();
					found = true;
					break;
				}
			}
			if (found == false) {
				System.out.println(search + "이 없습니다.");
			}
		}
		sc.close();
	}

}