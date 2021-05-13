package graphics;

import java.util.Scanner;
import java.util.UUID;

import objects.Game;
import objects.GameSaveManager;
import objects.Timer;
import objects.TimerRunnable;
import upgrades.Upgrade;
import upgrades.Upgrades;
import util.Config;
import workers.Workers;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static GUI gui;
	public static Game game;
	public static Timer timer;
	public static GameSaveManager gameSaveManager;
	
	public static Config config;
	
	//Main Method
	public static void main(String[] args) {
		
		config = new Config();
		gameSaveManager = new GameSaveManager();
		
		System.out.println("Please enter your game save key: ");
		game = gameSaveManager.getGame(scanner.nextLine());		
		
		gui = new GUI();
				
		timer = new Timer();
				
		gui.openGUI();
	}
	
	private void loadSaveGame(String uuid) {
		
	}
	
	public Game getGame() {
		return game;
	}
	
}
