package lecture;

class Shape2 {
	public void draw() { System.out.println("Shape");}
}

class Line2 extends Shape2 {
	public void draw() { System.out.println("Line");}
}
public class test {

	public static void main(String[] args) {
		Shape2 shape = new Line2();
		Shape2 shape1 = new Shape2();
		shape = shape1;
		shape.draw();
	}

}
