package practice;

class Circle {
	private int radius;
	private final double PI = 3.14;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return PI * radius * radius;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		Circle[] circle = new Circle[5];
		for(int i=0; i< circle.length; i++) {
			circle[i] = new Circle(i);
			System.out.print((int)(circle[i].getArea()) + " ");
		}
	}

}
