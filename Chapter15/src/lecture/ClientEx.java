package lecture;

import java.io.*;
import java.util.*;
import java.net.*;

public class ClientEx {

	public static void main(String[] args) {
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost", 9999); //클라이언트 소켓 생성, 서버 연결
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("보내기 >> ");
				String outputMessage = sc.nextLine(); // 키보드에서 읽기
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n"); //bye 종료
					out.flush();
					break;
				}
				out.write(outputMessage + "\n"); //키보드 내용 전송
				out.flush();
				String inputMessage = in.readLine(); // 서버로부터 받음
				System.out.println("[서버] " + inputMessage);				
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				if(socket != null) socket.close(); //클라이언트 소켓 닫기
			} catch (Exception e) {
				System.out.println("채팅 중 오류 발생");
			}
		}
	}
}
