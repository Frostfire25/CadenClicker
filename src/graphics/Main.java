package graphics;

import java.util.Scanner;

import java.util.UUID;

import objects.Game;
import objects.GameSaveManager;
import objects.Timer;
import objects.TimerRunnable;
import upgrades.Upgrade;
import upgrades.Upgrades;
<<<<<<< HEAD
import workers.WorkerClass;
import workers.Workers;
=======
import util.Config;
>>>>>>> main

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);

	public static GUI gui;
	public static Game game;
<<<<<<< HEAD
	public static Upgrades upgrades;
	public static WorkerClass workers;
=======
	public static Timer timer;
	public static GameSaveManager gameSaveManager;
	
	public static Config config;
>>>>>>> main
	
	//Main Method
	public static void main(String[] args) {
		
<<<<<<< HEAD
		game = new Game();
		upgrades = new Upgrades(1);
		workers = new WorkerClass();
=======
		config = new Config();
		gameSaveManager = new GameSaveManager();
		
		System.out.println("Please enter your game save key: ");
		game = gameSaveManager.getGame(scanner.nextLine());		
>>>>>>> main
		
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
