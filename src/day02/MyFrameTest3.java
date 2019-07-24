package day02;

import java.awt.*;
import javax.swing.*;

class MyFrame01 extends JFrame {
	public MyFrame01() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("안녕하세요?");
		JButton button = new JButton("버튼");
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
	}
}

public class MyFrameTest3 {
	public static void main(String[] args) {
		MyFrame01 f = new MyFrame01();
	}
}
