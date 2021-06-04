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
import upgrades.Upgrades;
import workers.WorkerClass;

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
import java.awt.Font;
import javax.swing.SwingConstants;


public class CadenClickerGUI extends JFrame {

	public ContentPanel contentPanel;

	//private JButton mainCadenButton;
	//private JButton upgradeButton;
	//private JLabel cadensLabel;
	
	//private ImageIcon cadenIcon;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	
	public void displayGUI() {
		setVisible(true);
	}
	
	public void hideGUI() {
		setVisible(false);
	}
	
	public void centeringWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
              
        int x;
        int y;

        x = (int) (dimension.getWidth() - getWidth()) / 2;
        y = (int) (dimension.getHeight() - getHeight()) / 2;

        setLocation(x, y);
    }

	
	public CadenClickerGUI() {
		//GUI defualts setup
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 800);
		setResizable(false);
		
		centeringWindow();
		
		//CotentPane setup
		
		contentPanel = new ContentPanel();

		/*
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JButton button_4 = new JButton("Chris");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent Click) {
				WorkerClass workers = new WorkerClass();
				//workers.
			}
		});
		button_4.setBounds(1330, 62, 150, 79);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Hunter");
		button_5.setBounds(1330, 203, 150, 79);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("SirEvrim");
		button_6.setBounds(1330, 344, 150, 79);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Tanner");
		button_7.setBounds(1330, 485, 150, 79);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("LostDolla");
		button_8.setBounds(1330, 626, 150, 79);
		contentPane.add(button_8);

		contentPane.setLayout(null);
		
		//mainCadenButton = new JButton(cadenIcon);
		//mainCadenButton.setBackground(Color.DARK_GRAY);
		//mainCadenButton.setSize(250, 250);
		//mainCadenButton.setLocation(10, 11);
		//mainCadenButton.setBounds(50, 200, 250, 250);
		//mainCadenButton.setPreferredSize(new Dimension(cadenIcon.getIconHeight(), cadenIcon.getIconWidth()));

		mainCadenButton.setContentAreaFilled(false);
		mainCadenButton.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		mainCadenButton.addActionListener(new CadenClickEvent());
		mainCadenButton.setIcon(cadenIcon);

		upgradeButton = new JButton("UPGRADE");
		upgradeButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 18));
		upgradeButton.setLocation(300,200);
		upgradeButton.setPreferredSize(new Dimension(250, 250));
		upgradeButton.setBounds(270, 141, 120, 95);
		upgradeButton.addActionListener(new UpgradeClickEvent());
		
		cadensLabel = new JLabel(String.valueOf(Main.game.getCadens()));
		cadensLabel.setHorizontalAlignment(SwingConstants.CENTER);
		cadensLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		cadensLabel.setSize(55, 25);
		cadensLabel.setLocation(107, 272);
		
		contentPane.add(mainCadenButton);
		contentPane.add(upgradeButton);

		contentPane.add(cadensLabel);		
		getContentPane().add(contentPane);
		
		JLabel upgradeCostLabel = new JLabel("Cost: " + (new Upgrades(Main.game.getUpgradeLevel()+1)).GetCost());
		upgradeCostLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
		upgradeCostLabel.setHorizontalAlignment(SwingConstants.CENTER);
		upgradeCostLabel.setBounds(270, 236, 120, 25);
		contentPane.add(upgradeCostLabel);
		contentPane.add(cadensLabel);	
		*/
		setContentPane(contentPanel);
	}
	
	//352130d8-58e4-4c60-8a5f-ee22fcc47dd8
	

	/*
	public void changeButton()
	{
		mainCadenButton.setIcon(cadenIcon);
    
public void changeButton()
	{
		//mainCadenButton.setIcon(cadenIcon);

	}
	
	public void updateCount()
	{

		cadensLabel.setText(String.valueOf(Main.game.getCadens()) + " Cadens");

		//Initiates a new content panel
		//contentPane = new ContentPanel();
		
		setContentPane(contentPane);
	}
	*/
	
	public static ImageIcon iconscadens(String filename, int xscale, int yscale) 
	{
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("resources/Cadens/" + filename ));
		} catch (Exception e) {
			e.printStackTrace();
		}
		Image scaled = img.getScaledInstance(xscale,yscale,Image.SCALE_SMOOTH);
		return new ImageIcon(scaled);

	}
	
	public static ImageIcon utilImage(String filename, int xscale, int yscale) 
	{
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("resources/util/" + filename ));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Image scaled = img.getScaledInstance(xscale,yscale,Image.SCALE_SMOOTH);
		return new ImageIcon(scaled);
	}
}
