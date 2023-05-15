package lecture;

import javax.swing.*;
import java.awt.*;

public class ContentPanelEx extends JFrame{
	public ContentPanelEx(){
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //창의 x 누르면 꺼짐.
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout()); //배치관리자(LayoutManager) 설정
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ContentPanelEx();
	}

}
