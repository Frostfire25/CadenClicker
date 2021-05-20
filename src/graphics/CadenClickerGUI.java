package graphics;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadenClickerGUI extends JFrame {

	private JPanel contentPane;

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
	
	public CadenClickerGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
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
	}
}
