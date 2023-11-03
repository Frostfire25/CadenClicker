package graphics;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

import listeners.CadenClickEvent;
import listeners.UpgradeClickEvent;

public class GUI extends JFrame {

	private JPanel clickerPanel;
	private JButton mainCadenButton;
	private JButton upgradeButton;
	private JLabel cadensLabel;
	
	private ImageIcon cadenIcon;
	
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,800);
		setResizable(false);
		setBackground(Color.PINK);
		
		iconscadens("cadenfixed.png", 250,250);
		clickerPanel();
	}
	
	public void centeringWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x;
        int y;

        x = (int) (dimension.getWidth() - getWidth()) / 2;
        y = (int) (dimension.getHeight() - getHeight()) / 2;

        setLocation(x, y);
    }
	
	//Set's up the icons
	
	public void iconscadens(String filename, int xscale, int yscale) 
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
		clickerPanel = new JPanel(new BorderLayout());
		clickerPanel.setBounds(0,0,1000,1000);    
		clickerPanel.setBackground(Color.CYAN);  	       
		
		mainCadenButton = new JButton(cadenIcon);
		mainCadenButton.setLocation(50, 200);
		//mainCadenButton.setBounds(50, 200, 250, 250);
		mainCadenButton.setPreferredSize(new Dimension(cadenIcon.getIconHeight(), cadenIcon.getIconWidth()));
		mainCadenButton.setOpaque(false);
		mainCadenButton.setContentAreaFilled(false);
		mainCadenButton.setBorderPainted(false);
		mainCadenButton.setBorder(BorderFactory.createEmptyBorder());
		mainCadenButton.addActionListener(new CadenClickEvent());
		mainCadenButton.setIcon(cadenIcon);

		upgradeButton = new JButton("Upgrade to next level");
		upgradeButton.setLocation(300,200);
		upgradeButton.setPreferredSize(new Dimension(250, 250));
		upgradeButton.setBounds(50, 200, 250, 250);
		upgradeButton.addActionListener(new UpgradeClickEvent());
		
		cadensLabel = new JLabel(String.valueOf(Main.game.getCadens()));
		cadensLabel.setLocation(50, 400);
		
		clickerPanel.add(mainCadenButton);
		clickerPanel.add(upgradeButton);

		clickerPanel.add(cadensLabel);		
		add(clickerPanel);

	}

	public JPanel getClickerPanel() {
		return clickerPanel;
	}

	public void openGUI() 
	{
		centeringWindow();
		setVisible(true);
	}
	
	public void closeGUI() 
	{
		setVisible(false);
	}
}
