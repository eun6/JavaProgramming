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
}

class Quiz extends Num_12 {
	//단어 테스트
	public static void WordQuiz() {
		System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
		
		while(true) {
			int num;
			Question();
			try {
				num = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("숫자를 입력하세요 !!");
				sc = new Scanner(System.in);
				continue;
			}
			if (num == -1) {System.out.println(); break;}
			else checkAnswer(num);
		}
	}
	public static void Question() {
		// Vector에 넣은 값 중 랜덤하게 4개를 정해 객체 배열을 생성.
		// 중복되는 값이 있으면 한 번 더 돌린다.
		for(int i=0; i<4; i++) {
			arr[i] = v.get((int)(Math.random()*v.size()));
			
			for(int j=0; j<i; j++) { if(arr[i].equals(arr[j])) i--; }
		}
		
		// 생성한 4개의 객체 배열 중 무작위로 값을 뽑고 질문한다.
		int random = (int)(Math.random()*4);
		randomQuestion = random+1;
		System.out.println(arr[random].getEng() + "?");
		for(int x=0; x<4; x++) {
			System.out.print("(" + (x+1) + ")" + arr[x].getKor());
		}
		System.out.print(" :>");
	}
	public static void checkAnswer(int num) {
		if (randomQuestion == num) System.out.println("Excellent !!");
		else System.out.println("No. !!");
	}
}

public class Num_12 {
	static Vector<Word> v = new Vector<Word>();
	static Scanner sc = new Scanner(System.in);
	static Word arr[] = new Word[4];
	static int randomQuestion = 0;
	
	//단어 사전
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
	
	//단어 삽입
	public static void InsertWord() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while(true) {
			System.out.print("영어 한글 입력 >> ");
			String Eng = sc.next();
			if (Eng.equals("그만")) {System.out.println(); break;} 
			String Kor = sc.next();
			
			v.add(new Word(Eng, Kor));
		}
	}
	
	public static void main(String[] args) {
		System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다.");
		Dic();
		while(true) {
			int choose;
			System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
			try {
				choose = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("숫자를 입력하세요 !!");
				sc = new Scanner(System.in);
				continue;
			}
			if (choose == 3) {System.out.println("\"명품영어\"를 종료합니다."); break;}
			else if (choose == 1) Quiz.WordQuiz();
			else if (choose == 2) InsertWord();
			else System.out.println("올바른 보기를 선택하세요 !!");
		}
		sc.close();
	}
}