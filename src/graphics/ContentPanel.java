package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
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
import objects.Game;
import workers.Worker;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ContentPanel extends JPanel {
	
	private JPanel clickerPanel;
	public JButton mainCadenButton;
	private JButton upgradeButton;
	private JLabel cadensLabel;
	private JLabel pictureFrame;
	private JButton saveButton;
	
	private ImageIcon cadenIcon;
	private ImageIcon pictureFrameIcon;
	private ImageIcon saveGameIcon;
	
	
	public ContentPanel() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);		
		
		JButton button_4 = new JButton("Chris");
		button_4.setBounds(1005, 28, 150, 79);
		button_4.addActionListener(Main.game.chrisworker);
		add(button_4);
		
		JButton button_5 = new JButton("Hunter");
		button_5.setBounds(1005, 179, 150, 79);
		button_5.addActionListener(Main.game.hunterworker);
		add(button_5);
		
		JButton button_6 = new JButton("SirEvrim");
		button_6.setBounds(1005, 330, 150, 79);
		button_6.addActionListener(Main.game.sirevrimworker);
		add(button_6);
		
		JButton button_7 = new JButton("Tanner");
		button_7.setBounds(1005, 481, 150, 79);
		button_7.addActionListener(Main.game.tannerworker);
		add(button_7);
		
		JButton button_8 = new JButton("LostDolla");
		button_8.setBounds(1005, 632, 150, 79);
		button_8.addActionListener(Main.game.lostdollaworker);
		add(button_8);
	
		/*
		 * Buttons
		 */
		
		
		pictureFrameIcon = CadenClickerGUI.utilImage("pictureframefixed.png", 300, 300);
		pictureFrame = new JLabel(pictureFrameIcon);
		pictureFrame.setBackground(Color.DARK_GRAY);
		pictureFrame.setSize(300, 300);
		pictureFrame.setLocation(10, 20);
		pictureFrame.setIcon(pictureFrameIcon);
		
		cadenIcon = CadenClickerGUI.iconscadens(Main.game.GetUpgrade().getFileName(), 250,250);
		mainCadenButton = new JButton(cadenIcon);
		mainCadenButton.setBackground(Color.DARK_GRAY);
		mainCadenButton.setSize(250, 250);
		mainCadenButton.setLocation(10, 50);
		mainCadenButton.setBorder(BorderFactory.createEmptyBorder());
		mainCadenButton.setBorderPainted(false);
		mainCadenButton.setPreferredSize(new Dimension(cadenIcon.getIconHeight(), cadenIcon.getIconWidth()));
		mainCadenButton.setContentAreaFilled(false);
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
		
		saveGameIcon = CadenClickerGUI.utilImage("savegamebutton.png", 75, 75);
		saveButton = new JButton(saveGameIcon);
		saveButton.setBackground(Color.DARK_GRAY);
		saveButton.setSize(100, 100);
		saveButton.setLocation(10, 650);
		saveButton.setBorder(BorderFactory.createEmptyBorder());
		saveButton.setBorderPainted(false);
		saveButton.setPreferredSize(new Dimension(saveGameIcon.getIconHeight(), saveGameIcon.getIconWidth()));
		saveButton.setContentAreaFilled(false);
		saveButton.addActionListener(new CadenClickEvent());
		saveButton.setIcon(saveGameIcon);
		
		/*
		 * Adding all the buttons & labels
		 */

		add(mainCadenButton);
		add(saveButton);
		//add(pictureFrame);
		add(upgradeButton);

		//TEST-uuid : 352130d8-58e4-4c60-8a5f-ee22fcc47dd8
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
	
	/*
	public void changeButton()
	{
		mainCadenButton.setIcon(cadenIcon);
		update();
	}
	*/
	
	public void updateCount()
	{
		cadensLabel.setText(String.valueOf(Main.game.getCadens()) + " Cadens");
	}
	
	public void displayNotEnoughCadens() {
		displayText("Not enough cadens.", "red");
	}
	
	public void displayText(String text, String color) {
		JLabel label = new JLabel("<html> <font color='"+color+"'>"+text+"</font> </html>", JLabel.CENTER);
		label.setBounds(500,700,200, 50);
		label.setFont(new Font("SansSerif", Font.PLAIN, 21));
		label.setBackground(Color.BLACK);
		
		add(label);
		update();
	
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				label.setVisible(false);
				remove(label);
			}
			
		}, 3000L);
	}
	
	public void update() {
		revalidate();
		repaint();
	}

}
