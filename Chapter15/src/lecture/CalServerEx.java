package lecture;

import java.io.*;
import java.util.*;
import java.net.*;

public class CalServerEx {
	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " ");
		if(st.countTokens() != 3) return "error";
		String res = "";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch(opcode) {
		case "+" : res=Integer.toString(op1 + op2); break;
		case "-" : res=Integer.toString(op1 - op2); break;
		case "*" : res=Integer.toString(op1 * op2); break;
		case "/" : res=Integer.toString(op1 / op2); break;
		}
		return res;
	}

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
				String res = calc(inputMessage);
				out.write(res + "\n");
				out.flush();
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (socket != null) socket.close();
				if (listener != null) listener.close();
			} catch (Exception e) {
				System.out.println("채팅 중 오류 발생");
			}
		}
	}
}
