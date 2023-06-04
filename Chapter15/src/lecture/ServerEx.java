package lecture;

import java.io.*;
import java.util.*;
import java.net.*;

public class ServerEx {

	public static void main(String[] args) {
		ServerSocket listener = null;
		Socket socket = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			listener = new ServerSocket(9999); //서버 소켓 생성
			System.out.println("연결 대기");
			socket = listener.accept(); // 클라이언트로부터 연결 요청 오기를 대기
			System.out.println("연결 됨");
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				String inputMessage = in.readLine(); // 클라이언트로부터 읽기
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 연결 종료");
					break;
				}
				System.out.println("[클라이언트] " + inputMessage);
				System.out.println("보내기 >> ");
				String outputMessage = sc.nextLine(); // 키보드에서 읽기
				out.write(outputMessage + "\n");
				out.flush();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				sc.close();
				socket.close();
				listener.close();
			} catch (Exception e) {
				System.out.println("채팅 중 오류 발생");
			}
		}
	}
}
