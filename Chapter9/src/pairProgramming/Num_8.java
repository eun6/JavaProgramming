package pairProgramming;

import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("����"));
		add(new JButton("�ݱ�"));
		add(new JButton("������"));
	}
}
class CenterPanel extends JPanel {
	public CenterPanel() {
		setLayout(null);
		
		for(int i=0; i<10; i++) {
			int x = (int) (Math.random()*250);
			int y = (int) (Math.random()*250);
			JLabel la = new JLabel("*");
			la.setForeground(Color.RED);
			la.setLocation(x, y);
			la.setSize(10, 10);
			add(la);
		}
	}
}

class SouthPanel extends JPanel {
	public SouthPanel() {
		setBackground(Color.YELLOW);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JButton("Word Input"));
		add(new JTextField(15));
	}
}

public class Num_8 extends JFrame {
	public Num_8() {
		setTitle("���� ���� �г��� ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Num_8();
		
	}

}
