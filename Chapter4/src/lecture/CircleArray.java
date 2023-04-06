package lecture;

class Circle2 {
	int radius;
	public Circle2(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14*this.radius*this.radius;
	}
}

public class CircleArray {

	public static void main(String[] args) {
		//배열 생성
		Circle2[] c = new Circle2[5];
		
		//각 배열에 인스턴스 생성
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle2(i);
		}
		//c는 Circle2 배열 객체이므로, a도 객체로 해줘야(?)
		for(Circle2 a : c) {
			System.out.println(a.getArea());
		}
	}

}
