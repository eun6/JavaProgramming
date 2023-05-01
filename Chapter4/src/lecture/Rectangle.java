package lecture;

import java.util.*;
public class Rectangle {
	int width;
	int height;

	public int getArea() {
		return width * height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">> ");
		Rectangle r = new Rectangle();
		r.width = sc.nextInt();
		r.height = sc.nextInt();
		
		System.out.println("면적은 " + r.getArea());
		sc.close();
	}
}
