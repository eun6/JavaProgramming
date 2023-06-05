package lecture;

import java.awt.*;
import javax.swing.*;

class FlickeringLabel extends JLabel implements Runnable {
	private long delay;
	
	public FlickeringLabel(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if (n == 0) {
				setBackground(Color.YELLOW);
				n = 1;
			}
			else {
				setBackground(Color.GREEN);
				n = 0;
			}
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
				return;
			}
		}
	}
}

public class FlickeringLabelEx extends JFrame{
	public FlickeringLabelEx() {
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// �����̴� ���̺� ����
		FlickeringLabel fLabel = new FlickeringLabel("����", 500);
		// �������� �ʴ� ���̺� ����
		JLabel Label = new JLabel("�ȱ���");
		// �����̴� ���̺� ����
		FlickeringLabel fLabel2 = new FlickeringLabel("���⵵ ����", 300);
		
		c.add(fLabel);
		c.add(Label);
		c.add(fLabel2);
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlickeringLabelEx();
	}

}
