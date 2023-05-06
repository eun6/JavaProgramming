package pairProgramming;

import java.util.*;

class Word {
	private String Eng, Kor;
	public Word() {}
	public Word(String Eng, String Kor) {
		this.Eng = Eng; this.Kor = Kor;
	}
	public String getEng() {
		return Eng;
	}
	public String getKor() {
		return Kor;
	}
	
	public String toString() {
		return "(" + Eng + ", " + Kor + ")";
	}
}

public class Num_12 {
	static Vector<Word> v = new Vector<Word>();
	static Word arr[] = new Word[4];
	static int choose = 0;
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
		// Vector에 넣은 값 중 랜덤하게 4개를 정해 객체 배열을 생성.
		// 중복되는 값이 있으면 한 번 더 돌린다.
		for(int i=0; i<4; i++) {
			arr[i] = v.get((int)(Math.random()*8));
			//System.out.println(arr[i].toString());
			
			for(int j=0; j<i; j++) { if(arr[i].equals(arr[j])) i--; }
		}
		
		// 생성한 4개의 객체 배열 중 무작위로 값을 뽑고 질문한다.
		int random = (int)(Math.random()*4);
		choose = random+1;
		System.out.println(arr[random].getEng() + "?");
		for(int x=0; x<4; x++) {
			System.out.print("(" + (x+1) + ")" + arr[x].getKor());
		}
		System.out.print(" :>");
	}
	public static void checkAnswer(int num) {
		if (choose == num) System.out.println("Excellent !!");
		else System.out.println("No. !!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dic();
		System.out.println("\"명품영어\"의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다.");

		while(true) {
			Question();
			int num = sc.nextInt();
			if (num == -1) {System.out.println("\"명품영어\"를 종료합니다..."); break;}
			else checkAnswer(num);
		}
		sc.close();
	}
	

}