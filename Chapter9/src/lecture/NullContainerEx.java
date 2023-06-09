package lecture;

import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	public NullContainerEx() {
		setTitle("Null Container Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane(); //pane 달고, 배치관리자는 null
		c.setLayout(null);
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50);
		la.setSize(200, 20);
		c.add(la);
		for(int i=1; i<=9; i++) {
			JButton b = new JButton(Integer.toString(i)); //버튼 생성
			b.setLocation(i*15, i*15);
			b.setSize(50, 20);
			c.add(b);
		}
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainerEx();
	}

}
