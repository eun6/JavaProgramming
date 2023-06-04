package pairProgramming;

import java.net.*;
import java.util.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ChatServer extends JFrame{
	static Vector<String> wordVector = new Vector<String>();
	static JTextArea ta = new JTextArea();
	
	public ChatServer() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(ta);
		ta.setEnabled(false);
		ta.setDisabledTextColor(Color.black);
		c.setBackground(Color.white);
		
		setTitle("영어 스펠 체크 서버");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
				
		try {
			// 서버 소켓 생성
			ServerSocket listener = new ServerSocket(9999);
			// word.txt 파일 읽기
			ReadTXT();
			while (true) {
                // 클라이언트로부터 연결 요청 대기
                Socket socket = listener.accept();
                ta.append("클라이언트 연결됨" +"\n");

                // 클라이언트와 통신하기 위한 새로운 스레드 생성
                ClientHandler handler = new ClientHandler(socket);
                handler.start();
            }
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//txt파일 읽는 메서드
	public static void ReadTXT() throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("C:\\words.txt"));
		//파일 끝까지 반복하여 읽기
		while(sc.hasNext()) {
			String word = sc.nextLine();
			wordVector.add(word);
		}
		ta.append("words.txt 읽기 완료" +"\n");
	}
	
	//txt파일에 있는지 확인하는 메서드
	public static String Check(String word) {
		String result = null;
		if (wordVector.contains(word)) result = "YES";
		else result = "NO";
		return result;
	}

	public static void main(String[] args) {
		new ChatServer();
		
	}

	
	// 클라이언트 처리를 위한 스레드 클래스
    private static class ClientHandler extends Thread {
        private Socket socket;
        private BufferedReader in;
        private BufferedWriter out;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 클라이언트와 통신을 위한 입출력 스트림 생성
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                String inputMessage;
                while ((inputMessage = in.readLine()) != null) {
                    if (inputMessage.equalsIgnoreCase("bye")) {
                    	ta.append("클라이언트 연결 종료." +"\n");
                        break;
                    }
                    String res = Check(inputMessage);
                    ta.append(inputMessage + "=" + res +"\n");
                    out.write(inputMessage + "는 " + res + "\n");
                    out.flush();
                }
            } catch (IOException e) {
            	ta.append("클라이언트와 통신 중 오류 발생: " + e.getMessage() +"\n");
            } finally {
                try {
                    if (in != null)
                        in.close();
                    if (out != null)
                        out.close();
                    if (socket != null)
                        socket.close();
                    } catch (Exception e) {
            				e.printStackTrace();
            		}
            }
        }
    }
}
