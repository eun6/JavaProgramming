package practice;

import java.util.Scanner;

class Book {
	private String title;
	private String author;
	
	public Book() {
		this("", "작자 미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public void printAll() {
		System.out.print("(" + title + ", " + author + ")");
	}
}

public class BookArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Book[] book = new Book[2];
		for(int i=0; i<book.length; i++) {
			System.out.print("제목>>");
			String title = sc.nextLine();
			System.out.print("저자>>");
			String author = sc.nextLine();
			book[i] = new Book(title, author);
		}
		for(Book a : book) {
			a.printAll();
		}
	}

}
