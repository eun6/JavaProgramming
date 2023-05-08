package lecture;

import java.io.*;

//저장한 바이너리 값을 불러오기
public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("c:\\Temp\\test.out");
			int n = 0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("c:\\Temp\\test.out 에서 읽은 배열을 출력합니다.");
			for(int i=0; i<b.length; i++) System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		}
		catch(IOException e) {
			System.out.println("c:\\Temp\\test.out 에서 못 읽음. 경로 체크 바람.");
		}
	}

}
