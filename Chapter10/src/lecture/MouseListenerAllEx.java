package lecture;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseListenerAllEx extends JFrame{
	
	private JLabel la = new JLabel("No Mouse Event");
	public MouseListenerAllEx() {
		setTitle("MouseListener & MouseMotinoLister 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//리스너가 2개이기 때문에 등록도 따로 해줘야함.
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed(" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased(" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {
			Component c= (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			Component c= (Component)e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged(" + e.getX() + "," + e.getY() + ")");
		}
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved(" + e.getX() + "," + e.getY() + ")");
		}
	}

	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
