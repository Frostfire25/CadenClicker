package graphics;

import java.awt.EventQueue;
import java.util.Scanner;

import java.util.UUID;

import objects.Game;
import objects.GameSaveManager;
import objects.Timer;
import objects.TimerRunnable;
import upgrades.Upgrade;
import upgrades.Upgrades;
import util.Config;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static CadenClickerGUI gui;
	public static Game game;
	public static Timer timer;
	public static GameSaveManager gameSaveManager;
	
	public static Config config;
	
	//Main Method
	public static void main(String[] args) {
		
		config = new Config();
		gameSaveManager = new GameSaveManager();
		
		loadSaveGame();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui = new CadenClickerGUI();
			} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
				
		timer = new Timer();
		
		gui.show();
	
	}
	
	private static void loadSaveGame() {
		System.out.println("Please enter your game save key: ");
		game = gameSaveManager.getGame(scanner.nextLine());		
	}
	
	public Game getGame() {
		return game;
	}
	
}
