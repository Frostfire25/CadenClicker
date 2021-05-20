package graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
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
<<<<<<< HEAD
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
=======
import java.awt.image.BufferedImage;
import java.io.File;
>>>>>>> 0ed6fca4a7335f263b627d66a819af8fd49ec867

public class CadenClickerGUI extends JFrame {

	private JPanel contentPane;

	private JButton mainCadenButton;
	private JButton upgradeButton;
	private JLabel cadensLabel;
	
	private ImageIcon cadenIcon;
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
		setBounds(100, 100, 2000, 800);
		setResizable(false);
		
		centeringWindow();
		
		//loading icons
		
		iconscadens("cadenfixed.png", 250,250);
		
		//CotentPane setup
		
		contentPane = new JPanel();
<<<<<<< HEAD
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("CoolCaden");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(143, 11, 55, 32);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("TravisCaden");
		button.setBounds(143, 54, 55, 32);
		contentPane.add(button);
		
		JButton button_1 = new JButton("HoodCaden");
		button_1.setBounds(235, 11, 55, 32);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("HoodMonaLisa");
		button_2.setBounds(235, 54, 55, 32);
		contentPane.add(button_2);
		
		JButton button_4 = new JButton("Chris");
		button_4.setBounds(369, 11, 55, 32);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("Hunter");
		button_5.setBounds(369, 54, 55, 32);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("SirEvrim");
		button_6.setBounds(369, 97, 55, 32);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Tanner");
		button_7.setBounds(369, 140, 55, 32);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("LostDolla");
		button_8.setBounds(369, 183, 55, 32);
		contentPane.add(button_8);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(48, 120, 46, 14);
		contentPane.add(lblNewLabel);
=======
		contentPane.setLayout(null);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout());
		
		mainCadenButton = new JButton(cadenIcon);
		mainCadenButton.setSize(176, 72);
		mainCadenButton.setLocation(86, 145);
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
		upgradeButton.setBounds(334, 49, 250, 250);
		upgradeButton.addActionListener(new UpgradeClickEvent());
		
		cadensLabel = new JLabel(String.valueOf(Main.game.getCadens()));
		cadensLabel.setSize(1614, 771);
		cadensLabel.setLocation(0, 0);
		
		contentPane.add(mainCadenButton);
		contentPane.add(upgradeButton);

		contentPane.add(cadensLabel);		
		getContentPane().add(contentPane);
	}
	
	public void changeButton()
	{
		mainCadenButton.setIcon(cadenIcon);
	}
	
	public void updateCount()
	{
		cadensLabel.setText(String.valueOf(Main.game.getCadens()) + " Cadens");
	}
	
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
>>>>>>> 0ed6fca4a7335f263b627d66a819af8fd49ec867
	}
}
