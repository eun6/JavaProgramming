package lecture;

import java.io.*;
public class FileReadHangulFail {

	public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		
		try {
			//(교재) US-ASCII -> 출력 결과가 깨짐. MS949 -> 정상 출력.
			//(실제) utf-8했을때 정상출력.
			fin = new FileInputStream("c:\\Temp\\hangul.txt");
			in = new InputStreamReader(fin, "UTF-8");
		}catch(Exception e) {
				System.out.println("파일 불러오는 거에서 오류");
		}
		try {
			int c;
			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char) c);
			}
			in.close();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
