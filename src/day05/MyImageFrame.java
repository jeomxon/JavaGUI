package day05;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyImageFrame extends JFrame{
	
	BufferedImage img = null;
	public MyImageFrame() {
		setTitle("Image Load Test");
		
		try {
			img = ImageIO.read(new File("cat.jpg"));
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		add(new MyPanel03());
		pack();
		setVisible(true);
	}
	
	class MyPanel03 extends JPanel {
		public void paint(Graphics g) {
			g.drawImage(img, 0, 0, null);
		}
		
		public Dimension getPreferredSize() {
			if (img == null) {
				return new Dimension(100, 100);
			}
			else {
				return new Dimension(img.getWidth(null), img.getHeight(null));
			}
		}
	}
	
	public static void main(String[] args) {
		new MyImageFrame();
	}
}
