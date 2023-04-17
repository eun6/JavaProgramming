package lecture;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This ");
		
		//덧붙이기.
		sb.append("is pencil");
		System.out.println(sb);
		
		//삽입.
		sb.insert(7, " my");
		System.out.println(sb);
		
		//교체.
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		//삭제.
		sb.delete(7, 12);
		System.out.println(sb);
		
		//문자열 길이 조정.
		sb.setLength(4);
		System.out.println(sb);
	}

}
