package day02;

import java.awt.*;
import javax.swing.*;

class MyFrame03 extends JFrame {
	public MyFrame03() {
		setSize(500, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�׽�Ʈ ������");
		
		JPanel panel = new JPanel();
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEditable(false);
		
		panel.add(t1); // �гο� �ؽ�Ʈ �ʵ带 �߰��Ѵ�.
		panel.add(t2);
		
		add(panel); // �г��� �����ӿ� �߰�
		setVisible(true);
	}
}

public class MyFrameTest5 {
	public static void main(String[] args) {
		MyFrame03 f = new MyFrame03();
	}
}