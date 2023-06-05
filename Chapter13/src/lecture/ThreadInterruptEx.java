package lecture;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class TimerRunnable2 implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable2(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadInterruptEx extends JFrame{
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//Thread를 상속 받지 않는 대신, 객체 생성시 runnable 넣어줌.
		TimerRunnable2 runnable = new TimerRunnable2(timerLabel);
		Thread th = new Thread(runnable);
		c.add(timerLabel);
		
		//버튼 리스너
		JButton btn = new JButton("kill Timer");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt(); // 타이머스레드 강제 종료
				JButton btn = (JButton) e.getSource();
				btn.setEnabled(false);
			}
		});
		
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		th.start();
	}

	public static void main(String[] args) {
		new ThreadInterruptEx();
	}

}
