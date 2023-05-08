package lecture;

import java.io.*;
// *예제 8-10 출력 제대로 안 됨.
// *다만, 종료 후  copy는 제대로 됨. -> while문이 계속 도는 문제.
// -> 이미지 파일의 문제...!
public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Windows\\img19.jpg");
		File dest = new File("c:\\Temp\\copy.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte) c);
				System.out.println("ok?");
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 "+dest.getPath() + "로 복사하였습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
