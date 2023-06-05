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
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel = new FlickeringLabel("깜박", 500);
		// 깜박이지 않는 레이블 생성
		JLabel Label = new JLabel("안깜박");
		// 깜박이는 레이블 생성
		FlickeringLabel fLabel2 = new FlickeringLabel("여기도 깜박", 300);
		
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
