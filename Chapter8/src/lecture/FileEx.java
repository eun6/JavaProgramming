package lecture;

import java.io.File;

// *예제 8-8. File 클래스 내 이렇게 많은 메서드가 있다!

public class FileEx {
	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브리스트입니다.-----");
		File[] subFiles = dir.listFiles();
		for(int i=0; i<subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t파일크기:" + f.length());
			// (나) 형식에 따라 잘 안 나올 수 있으니 띄어쓰기 등을 주의할 것.
			System.out.printf("\t수정한 시간 : %tb %td %ta %tT\n", t, t, t, t);
		}
		
	}
	
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
		String res = "";
		if(f1.isFile()) res = "파일";
		else if(f1.isDirectory()) res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");
		File f2 = new File("c:\\Temp\\java_sample");
		if(!f2.exists()) {
			f2.mkdir(); // 존재하지 않으면 디렉토리 생성
		}
		listDirectory(new File("c:\\Temp"));
		f2.renameTo(new	File("c:\\Temp\\javasample"));
		listDirectory (new File("c:\\Temp"));
	}

}
