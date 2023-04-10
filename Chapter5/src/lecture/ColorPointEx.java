package lecture;

class Point {
	private int x, y; // ÇÑ Á¡À» ±¸¼ºÇÏ´Â x, y ÁÂÇ¥
	public void set( int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint () { // Á¡ÀÇ ÁÂÇ¥ Ãâ·Â
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point(); //Point °´Ã¼ »ý¼º
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
