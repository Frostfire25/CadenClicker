package graphics;

import javax.swing.JFrame;

public class GUI extends JFrame {

	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2000,800);
	}
	
	public void openGUI() {
		setVisible(true);
	}
	
	public void closeGUI() {
		setVisible(false);
	}
	
}
