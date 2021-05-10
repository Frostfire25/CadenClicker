package graphics;

import objects.Game;
import objects.GameSaveManager;
import objects.Timer;
import objects.TimerRunnable;
import upgrades.Upgrade;
import upgrades.Upgrades;
import util.Config;
import workers.Workers;

public class Main {

	public static GUI gui;
	public static Game game;
	public static Upgrades upgrades;
	public static Workers workers;
	public static Timer timer;
	public static GameSaveManager gameSaveManager;
	
	public static Config config;
	
	//Main Method
	public static void main(String[] args) {
		
		config = new Config();
		gameSaveManager = new GameSaveManager();
		
		gui = new GUI();
		
		game = new Game();
		
		upgrades = new Upgrades();
		workers = new Workers();
		timer = new Timer();
				
		gui.openGUI();
	}
	
	private void loadSaveGame(String uuid) {
		
	}
	
}
