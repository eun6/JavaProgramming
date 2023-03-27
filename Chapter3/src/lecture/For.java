package lecture;

public class For {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<11; i++) {
			sum += i;
			if(i == 10) {
				System.out.print(i + "=" + sum);
			}
			else {
				System.out.print(i + "+");
			}
		}
	}

}
