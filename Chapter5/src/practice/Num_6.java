package practice;

class ColorPoint2 extends Point{
	private String color;
	ColorPoint2() {
		super(0, 0);
		this.color = "BLACK";
	}
	ColorPoint2(int x, int y) {
		super(x, y);
	}
	void setXY(int x, int y) {
		super.move(x, y);
	}
	void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return this.color + "색의 (" + this.getX() + ", " + this.getY() + ")의 점"; 
	}
}

public class Num_6 {

	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}

}
