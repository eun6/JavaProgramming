package lecture;

import java.io.*;
import java.util.Scanner;

public class BufferedIOEx {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while ((c = fin.read()) != -1) out.write(c);
			
			// 데이터 전체 출력
			new Scanner(System.in).nextLine();
			out.flush(); // 버퍼에 남아있는 거 다 출력
			fin.close();
			out.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
