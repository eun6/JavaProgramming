package pairProgramming;

import java.util.*;

class Word {
	private String Eng, Kor;
	public Word(String Eng, String Kor) {
		this.Eng = Eng; this.Kor = Kor;
	}
	public String toString() {
		return Eng + " " + Kor;
	}
}

public class Num_12 {
	static Vector<Word> v = new Vector<Word>();
	static Scanner sc = new Scanner(System.in);
	public static void Dic() {
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("painting", "그림"));
		v.add(new Word("bear", "곰"));
		v.add(new Word("eye", "눈"));
		v.add(new Word("picture", "사진"));
		v.add(new Word("society", "사회"));
		v.add(new Word("human", "인간"));
	}
	public static void Question() {
	
		while(true) {
			System.out.println(v.get((int)(Math.random()*8)) + "?");
			
			int num = sc.nextInt();
			if(num == -1) System.out.println("\"명품영어\"를 종료합니다..."); break;
			//else if(num)
		}		
	}

	public static void main(String[] args) {
		
		Dic();
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");
		Question();
		
	}
	

}
