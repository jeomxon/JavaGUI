package day03;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BoxTest {
	public static void main(String[] args) {
		MyFrame04 f = new MyFrame04();
	}
}

class MyFrame04 extends JFrame {
	public MyFrame04() {
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		makeButton(panel, "Button1");
		makeButton(panel, "Button2");
		makeButton(panel, "Button3");
		makeButton(panel, "B4");
		makeButton(panel, "Long Button5");
		
		add(panel);
		pack();
		setVisible(true);
		
	}
	private void makeButton(JPanel panel, String text) {
		JButton button = new JButton(text);
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(button);
	}
}
