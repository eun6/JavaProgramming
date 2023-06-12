package practice;

import java.util.*;

class Student{
	int id;
	String number;
	
	public Student(int id, String number) {
		this.id = id; this.number = number;
	}
	public String toString(){
		return "id:" + id + ", 전화:" + number;
	}
}

public class HashMapStudentEx {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		map.put("이재문", new Student(2, "010-222-2222"));
		map.put("김남윤", new Student(3, "010-333-2222"));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름?");
			String name = sc.next();
			if(name.equals("그만")) break;
			if(map.containsKey(name)) {
				System.out.println(map.get(name).toString());
			} else {
				System.out.println("해당 내용이 없습니다.");
			}
		}
		sc.close();
	}
}
