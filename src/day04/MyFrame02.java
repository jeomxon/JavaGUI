package day04;

import java.awt.*;
import javax.swing.*;

public class MyFrame02 extends JFrame{
	public MyFrame02() {
		setTitle("MyFrame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel p = new MyPanel();
		setVisible(true);
		add(p);
	}
	
	
	public static void main(String[] args) {
		MyFrame02 frame = new MyFrame02();
	}
}

class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString("안녕하세요? 자바 프로그래머 여러분!", 10, 10);
		g.drawLine(10, 20, 110, 20);
		g.drawRect(10, 30, 100, 100);
	}
}

