import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		System.out.print("�̸��� " + name + ", ");
		
		String city = sc.next();
		System.out.print("���ô� " + city + ", ");
		
		int age = sc.nextInt();
		System.out.print("���̴� " + age + "��, ");
		
		double weight = sc.nextDouble();
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean single = sc.nextBoolean();
		System.out.print("���ſ��δ� " + single + "�Դϴ�.");
		
		sc.close();
	}

}