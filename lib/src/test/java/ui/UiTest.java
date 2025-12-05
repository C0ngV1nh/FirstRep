package ui;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import org.junit.jupiter.api.Test;
public class UiTest {
	@Test void FrameReturnAFrame() {
		JFrame f = new JFrame();
		
		f.setVisible(true);
		
		f.setSize(300,400);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.getContentPane().setBackground(Color.CYAN);
		
		ImageIcon img = new ImageIcon("C:\\Users\\LENOVO\\Desktop\\pic\\sddefault.jpg");
		
		f.setIconImage(img.getImage());
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
