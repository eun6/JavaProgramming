package lecture;

import java.util.StringTokenizer;

//p.369 StringTokenzier 예시.
public class StringTokenzierEx {

	public static void main(String[] args) {
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");
		
		int n = st.countTokens();
		System.out.println("token 개수 = " + st.countTokens());
		
		while(n>0) {
			System.out.println(st.nextToken());
			n--;
		}
	}

}
