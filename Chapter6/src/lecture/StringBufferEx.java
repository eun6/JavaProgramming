package lecture;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This ");
		
		//�����̱�.
		sb.append("is pencil");
		System.out.println(sb);
		
		//����.
		sb.insert(7, " my");
		System.out.println(sb);
		
		//��ü.
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		//����.
		sb.delete(7, 12);
		System.out.println(sb);
		
		//���ڿ� ���� ����.
		sb.setLength(4);
		System.out.println(sb);
	}

}
