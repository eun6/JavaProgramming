package lecture;

public class WrapperEx {

	public static void main(String[] args) {
		//'A'를 소문자로 변환.
		System.out.println(Character.toLowerCase('A'));
		
		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1)) System.out.println(c1 + "는 숫자");
		if(Character.isAlphabetic(c2)) System.out.println(c2 + "는 영문자");
		
		//String 값을 10진수로 변환.
		System.out.println(Integer.parseInt("-123"));
		//16진수로 변환.
		System.out.println(Integer.toHexString(28));
		//2진수로 변환.
		System.out.println(Integer.toBinaryString(28));
		//2진수의 1의 개수
		System.out.println(Integer.bitCount(28));
		
		Double d = Double.valueOf(3.14);
		//double값을 String값으로 변환.
		System.out.println(d.toString());
		//String값을 double값으로 변환.
		System.out.println(Double.parseDouble("3.14"));
		
		boolean b = (4>3);
		//문자열로 변환.
		System.out.println(Boolean.toString(b));
		System.out.println(Boolean.parseBoolean("false"));
	}

}
