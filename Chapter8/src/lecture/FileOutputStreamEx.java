package lecture;

import java.io.*;

//바이너리 값을 저장하기
public class FileOutputStreamEx {
public static void main(String[] args ) {
	byte b[] = {7,51,3,4, -1,24};
	try {
		FileOutputStream fout = new FileOutputStream ("c:\\Temp\\test.out");
		for(int i =0; i <b.length ; i++) {
			fout.write(b[i]);
		}
		fout.close(); }
	catch( IOException e) {
		System.out.println(" Temp test.out 에 저장할 수 없었습니다.");
		return; }
	System.out.println(" Temp test.out 을 저장하였습니다");}

}
