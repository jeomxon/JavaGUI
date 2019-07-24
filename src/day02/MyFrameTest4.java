package day02;

import java.awt.*;
import javax.swing.*;

class MyFrame02 extends JFrame {
	public MyFrame02() {
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("테스트 프레임");
		
		JPanel panel = new JPanel();
		JButton b1 = new JButton();
		b1.setText("왼쪽 버튼");
		JButton b2 = new JButton("중앙 버튼");
		JButton b3 = new JButton("오른쪽 버튼");
		b3.setEnabled(false); // 세 번째 버튼을 비활성으로 설정
		
		// 컴포넌트를 패널에 추가
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		add(panel); // 패널을 프레임에 추가
		setVisible(true);
	}
}


public class MyFrameTest4 {
	public static void main(String[] args) {
		MyFrame02 f = new MyFrame02();
	}
}
