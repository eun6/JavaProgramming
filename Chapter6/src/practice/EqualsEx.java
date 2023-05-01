package practice;

//* 추상 클래스는 상수, 변수 모두 포함.
// * 추상 메소드, 일반 메소드도 사용 가능.
abstract class RectImg {
	protected int width;
	protected int height;
	public abstract boolean equals(Object obj);
	public int getArea() {
		return width * height;
	};
}

class Rect extends RectImg {
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public boolean equals(Object obj) {
		Rect p = (Rect) obj;
		if(getArea() == p.getArea()) return true;
		else return false;
	};
}

public class EqualsEx {

	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
	}

}
