package lecture;

import java.io.*;
// *예제 8-11 얘는 정상 카피 후 종료됨.
public class BlockBinaryEx {

	public static void main(String[] args) {
		File src = new File("c:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
		File dest = new File("c:\\Temp\\desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte [] buf = new byte[1024*10]; //10KB 버퍼
			while(true) {
				int n = fi.read(buf); //버퍼 크기만큼 읽음. n은 실제 읽은 바이트
				fo.write(buf, 0, n);
				if(n<buf.length) break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "를 "+dest.getPath() + "로 복사하였습니다.");
		} catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
