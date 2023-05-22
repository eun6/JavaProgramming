package lecture;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import lecture.MouseAdapterEx.MyMouseListener;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage = new JLabel[3];
	
	public KeyListenerEx() {
		setTitle("KeyListener 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage[0] = new JLabel("getKeyCode()");
		keyMessage[1] = new JLabel("getKeyChar()");
		keyMessage[2] = new JLabel("getKeyText()");
		
		//pane에 배경색 보이게 하기
		//1. 요소 추가 2. 색깔 지정
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);;
		}	
		setSize(300, 150);
		setVisible(true);
				
		c.setFocusable(true);
		c.requestFocus();
	}
	//키보드로부터 code와 char(유니코드), Text 값 입력받는 리스너
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}
	}

	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
