package lecture;

public class PassByValue {
	static int increase(int m) {
		return m += 1;
	}

	public static void main(String[] args) {
		int n = 10;
		n = increase(n);
		System.out.println(n);
	}

}
