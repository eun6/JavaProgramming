
public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		//���� ������ ���
		int a=3, b=3, c=3, d=3;
		
		a = d++;
		System.out.println("a=" + a + ", d=" + d);
		a = ++d;
		System.out.println("a=" + a + ", d=" + d);
		a = d--;
		System.out.println("a=" + a + ", d=" + d);
		a = --d;
		System.out.println("a=" + a + ", d=" + d);
	}

}
