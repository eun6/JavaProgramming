package lecture;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(30, 20));
		c.add(new Button("Calculate"), BorderLayout.CENTER);
		c.add(new Button("add"), BorderLayout.NORTH);
		c.add(new Button("sub"), BorderLayout.SOUTH);
		c.add(new Button("mul"), BorderLayout.EAST);
		c.add(new Button("div"), BorderLayout.WEST);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}

}
