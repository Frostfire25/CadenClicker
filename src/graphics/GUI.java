package graphics;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import listeners.CadenClickEvent;

public class GUI extends JFrame {

	private JPanel clickerPanel;
	private JButton mainCadenButton;
	
	public GUI() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(2000,800);
		setResizable(false);
		
		clickerPanel();
	}
	
	private void clickerPanel() {
		clickerPanel = new JPanel();
		clickerPanel.setBounds(40,80,200,200);    
		clickerPanel.setBackground(Color.CYAN);  
		
		add(clickerPanel);
	        
		mainCadenButton = new JButton();
		mainCadenButton.setSize(200,200);
		mainCadenButton.setBounds(50,100,80,30);  
		mainCadenButton.setBackground(Color.YELLOW);
		mainCadenButton.addActionListener(new CadenClickEvent());
		
		clickerPanel.add(mainCadenButton);
		
	}
	
	public void openGUI() {
		setVisible(true);
	}
	
	public void closeGUI() {
		setVisible(false);
	}
	
}
