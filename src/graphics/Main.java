package graphics;

import upgrades.Upgrade;
import upgrades.Upgrades;

public class Main {

	public static GUI gui;
	
	public static Upgrades upgrades;
	
	//Main Method
	public static void main(String[] args) {
		gui = new GUI();
		
		upgrades = new Upgrades();
		
		gui.openGUI();
	}
	
}
