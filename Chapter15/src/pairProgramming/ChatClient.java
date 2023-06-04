package pairProgramming;

import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.*;

public class ChatClient extends JFrame {
	public static String Socket(String outputMessage) {
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			// 클라이언트 소켓 생성
			socket = new Socket("localhost", 9999);			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while(true) {
				//System.out.println("단어 입력");
				//String outputMessage = sc.nextLine();
				// 클라이언트로부터 읽기
				if (outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break;
				}
				out.write(outputMessage + "\n");
				out.flush();
				// 서버로부터 읽기
				String inputMessage = in.readLine();
				return inputMessage;
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (socket != null) socket.close();
			} catch (Exception e) {
				System.out.println("채팅 중 오류 발생");
			}
		}
		return "";
	}
	public ChatClient() {
		super("스펠체크 클라이언트");
		JTextField tf = new JTextField(10);
		JLabel result = new JLabel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		add(new JLabel("단어 입력"));
		add(tf);
		add(result);
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String resultFromServer = Socket(tf.getText());
				result.setText(resultFromServer);
			}
		});
		tf.setText("");
		setSize(300, 100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChatClient();
	}

}
