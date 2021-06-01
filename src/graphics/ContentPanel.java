package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listeners.CadenClickEvent;
import listeners.UpgradeClickEvent;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ContentPanel extends JPanel {
	
	private JPanel clickerPanel;
	private JButton mainCadenButton;
	private JButton upgradeButton;
	private JLabel cadensLabel;
	
	private ImageIcon cadenIcon;
	
	
	public ContentPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);
		setLayout(null);
		
		JButton button_4 = new JButton("Chris");
		button_4.setBounds(1005, 28, 150, 79);
		add(button_4);
		
		JButton button_5 = new JButton("Hunter");
		button_5.setBounds(1005, 179, 150, 79);
		add(button_5);
		
		JButton button_6 = new JButton("SirEvrim");
		button_6.setBounds(1005, 330, 150, 79);
		add(button_6);
		
		JButton button_7 = new JButton("Tanner");
		button_7.setBounds(1005, 481, 150, 79);
		add(button_7);
		
		JButton button_8 = new JButton("LostDolla");
		button_8.setBounds(1005, 632, 150, 79);
		add(button_8);

		setLayout(null);
		
		cadenIcon = CadenClickerGUI.iconscadens("cadenfixed.png", 250,250);
		mainCadenButton = new JButton(cadenIcon);
		mainCadenButton.setBackground(Color.DARK_GRAY);
		mainCadenButton.setSize(250, 250);
		mainCadenButton.setLocation(10, 11);
		//mainCadenButton.setBounds(50, 200, 250, 250);
		mainCadenButton.setPreferredSize(new Dimension(cadenIcon.getIconHeight(), cadenIcon.getIconWidth()));
		mainCadenButton.setContentAreaFilled(false);
		mainCadenButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainCadenButton.addActionListener(new CadenClickEvent());
		mainCadenButton.setIcon(cadenIcon);

		upgradeButton = new JButton("Upgrade to next level");
		upgradeButton.setLocation(300,200);
		upgradeButton.setPreferredSize(new Dimension(250, 250));
		upgradeButton.setBounds(10, 326, 250, 97);
		upgradeButton.addActionListener(new UpgradeClickEvent());
		
		cadensLabel = new JLabel(String.valueOf(Main.game.getCadens()));
		cadensLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		cadensLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cadensLabel.setSize(250, 43);
		cadensLabel.setLocation(10, 272);
		
		add(mainCadenButton);
		add(upgradeButton);

		add(cadensLabel);	
	}
	
	@Override
    public Dimension getPreferredSize() {
	      return new Dimension(1200, 800);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Draws background
		g.drawImage(CadenClickerGUI.utilImage("forest3.jpg", 1200, 800).getImage(), 0, 0, null);
	}
	
	public void changeButton()
	{
		mainCadenButton.setIcon(cadenIcon);
	}
	
	public void updateCount()
	{
		cadensLabel.setText(String.valueOf(Main.game.getCadens()) + " Cadens");
	}
<<<<<<< HEAD
=======
	
	public void changeButton()
	{
		mainCadenButton.setIcon(cadenIcon);
	}
	
	public void updateCount()
	{
		cadensLabel.setText(String.valueOf(Main.game.getCadens()) + " Cadens");
	}
	

>>>>>>> ece7764628b8a419ef545abc8ae51ba0f13d4c05
}
