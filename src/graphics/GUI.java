package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import listeners.CadenClickEvent;

public class GUI extends JFrame {

	private JPanel clickerPanel;
	private JButton mainCadenButton;
	
	private ImageIcon cadenIcon;
	
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2000,800);
		setResizable(false);
		
		icons();
		clickerPanel();
	}
	
	//Set's up the icons
	private void icons() {
		try {
			cadenIcon = new ImageIcon(ImageIO.read(getClass().getResource("cookie.png")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void clickerPanel() {
		clickerPanel = new JPanel();
		clickerPanel.setBounds(40,80,200,200);    
		clickerPanel.setBackground(Color.CYAN);  
		
		add(clickerPanel);
	       
		
		mainCadenButton = new JButton();
		mainCadenButton.setLocation(50, 200);
		mainCadenButton.setPreferredSize(new Dimension(250, 250));
		mainCadenButton.setBounds(50, 200, 250, 250);
		mainCadenButton.setBackground(Color.YELLOW);
		mainCadenButton.addActionListener(new CadenClickEvent());
		mainCadenButton.setIcon(cadenIcon);
		
		clickerPanel.add(mainCadenButton);
		
	}
	
	public void openGUI() {
		setVisible(true);
	}
	
	public void closeGUI() {
		setVisible(false);
	}
	
}
