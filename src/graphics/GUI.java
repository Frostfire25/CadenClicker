package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import listeners.CadenClickEvent;
import listeners.UpgradeClickEvent;

public class GUI extends JFrame {

	private JPanel clickerPanel;
	private JButton mainCadenButton;
	private JButton upgradeButton;
	
	private ImageIcon cadenIcon;
	
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2000,800);
		setResizable(false);
		
		
		iconscadens("cadenfixed.png", 250,250);
		clickerPanel();
	}
	
	//Set's up the icons
	
	private void iconscadens(String filename, int xscale, int yscale) 
	{
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("resources/Cadens/" + filename ));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Image scaled = img.getScaledInstance(xscale,yscale,Image.SCALE_SMOOTH);
		cadenIcon = new ImageIcon(scaled);
	}
	
	private void clickerPanel() {
		clickerPanel = new JPanel();
		clickerPanel.setBounds(40,80,200,200);    
		clickerPanel.setBackground(Color.CYAN);  
		
		add(clickerPanel);
	       
		
		mainCadenButton = new JButton(cadenIcon);
		mainCadenButton.setLocation(50, 200);
		//mainCadenButton.setBounds(50, 200, 250, 250);
		mainCadenButton.setPreferredSize(new Dimension(cadenIcon.getIconHeight(), cadenIcon.getIconWidth()));
		mainCadenButton.setOpaque(false);
		mainCadenButton.setContentAreaFilled(false);
		mainCadenButton.setBorderPainted(false);		
		mainCadenButton.addActionListener(new CadenClickEvent());
		mainCadenButton.setIcon(cadenIcon);

		upgradeButton = new JButton("Upgrade to next level");
		upgradeButton.setLocation(300,200);
		upgradeButton.setPreferredSize(new Dimension(250, 250));
		upgradeButton.setBounds(50, 200, 250, 250);
		upgradeButton.addActionListener(new UpgradeClickEvent());
		
		clickerPanel.add(mainCadenButton);
		clickerPanel.add(upgradeButton);
	}
	
	public void openGUI() {
		setVisible(true);
	}
	
	public void closeGUI() {
		setVisible(false);
	}
	
}
