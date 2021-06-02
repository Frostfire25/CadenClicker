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
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import listeners.CadenClickEvent;
import listeners.UpgradeClickEvent;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.Color;
import javax.swing.border.BevelBorder;

public class ContentPanel extends JPanel {
	
	private JPanel clickerPanel;
	private JButton mainCadenButton;
	private JButton upgradeButton;
	private JLabel cadensLabel;
	private JLabel pictureFrame;
	
	private ImageIcon cadenIcon;
	private ImageIcon pictureFrameIcon;
	
	
	public ContentPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);
		
		JButton btnNewButton = new JButton("CoolCaden");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setLayout(null);
		btnNewButton.setBounds(270, 11, 121, 52);
		add(btnNewButton);
		
		JButton button = new JButton("TravisCaden");
		button.setBounds(270, 74, 121, 52);
		add(button);
		
		JButton button_1 = new JButton("HoodCaden");
		button_1.setBounds(270, 137, 121, 52);
		add(button_1);
		
		JButton button_2 = new JButton("HoodMonaLisa");
		button_2.setBounds(270, 216, 121, 52);
		add(button_2);
		
		JButton button_4 = new JButton("Chris");
		button_4.setBounds(1330, 62, 150, 79);
		add(button_4);
		
		JButton button_5 = new JButton("Hunter");
		button_5.setBounds(1330, 203, 150, 79);
		add(button_5);
		
		JButton button_6 = new JButton("SirEvrim");
		button_6.setBounds(1330, 344, 150, 79);
		add(button_6);
		
		JButton button_7 = new JButton("Tanner");
		button_7.setBounds(1330, 485, 150, 79);
		add(button_7);
		
		JButton button_8 = new JButton("LostDolla");
		button_8.setBounds(1330, 626, 150, 79);
		add(button_8);

		setLayout(null);
	
		/*
		 * Buttons
		 */
		
		pictureFrameIcon = CadenClickerGUI.utilImage("pictureframefixed.png", 300, 300);
		pictureFrame = new JLabel(pictureFrameIcon);
		pictureFrame.setBackground(Color.DARK_GRAY);
		pictureFrame.setSize(300, 300);
		pictureFrame.setLocation(10, 20);
		pictureFrame.setIcon(pictureFrameIcon);
		
		cadenIcon = CadenClickerGUI.iconscadens("cadenfixed.png", 250,250);
		mainCadenButton = new JButton(cadenIcon);
		mainCadenButton.setBackground(Color.DARK_GRAY);
		mainCadenButton.setSize(250, 250);
		mainCadenButton.setLocation(10, 50);
		mainCadenButton.setBorder(BorderFactory.createEmptyBorder());
		mainCadenButton.setBorderPainted(false);
		//mainCadenButton.setBounds(50, 200, 250, 250);
		mainCadenButton.setPreferredSize(new Dimension(cadenIcon.getIconHeight(), cadenIcon.getIconWidth()));
		mainCadenButton.setContentAreaFilled(false);
		//mainCadenButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainCadenButton.addActionListener(new CadenClickEvent());
		mainCadenButton.setIcon(cadenIcon);
		
		upgradeButton = new JButton("Upgrade to next level");
		upgradeButton.setLocation(300,200);
		upgradeButton.setPreferredSize(new Dimension(250, 250));
		upgradeButton.setBounds(546, 366, 250, 250);
		upgradeButton.addActionListener(new UpgradeClickEvent());
		
		cadensLabel = new JLabel(String.valueOf(Main.game.getCadens()));
		cadensLabel.setSize(1604, 761);
		cadensLabel.setLocation(10, 11);
		
		/*
		 * Adding all the buttons & labels
		 */

		add(mainCadenButton);
		add(pictureFrame);
		add(upgradeButton);

		//TEST-uuid : 352130d8-58e4-4c60-8a5f-ee22fcc47dd8
		
		add(cadensLabel);	
	}
	
	@Override
    public Dimension getPreferredSize() {
	      return new Dimension(1800, 800);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Draws background
		g.drawImage(CadenClickerGUI.utilImage("forest3.jpg", 1800, 800).getImage(), 0, 0, null);
	}
	
	public void changeButton()
	{
		mainCadenButton.setIcon(cadenIcon);
	}
	
	public void updateCount()
	{
		cadensLabel.setText(String.valueOf(Main.game.getCadens()) + " Cadens");
	}
	
}
