package graphics;

import objects.Game;
import upgrades.Upgrade;
import upgrades.Upgrades;
import workers.Workers;

public class Main {

	public static GUI gui;
	public static Game game;
	public static Upgrades upgrades;
	public static Workers workers;
	
	//Main Method
	public static void main(String[] args) {
		gui = new GUI();
		
		game = new Game();
		upgrades = new Upgrades();
		workers = new Workers();
		
		gui.openGUI();
	}
	
}
