package objects;

import java.util.HashMap;
import java.util.UUID;

public class Game {

	//ID 
	private UUID uuid;
	
	/*
	 * Game information
	 */
	
	private int cadens;	
	
	/*
	 * Workers
	 */
	
	
	
	/*
	 * Upgrades
	 */
	
	public Game() {
		this.uuid = UUID.randomUUID();
		this.cadens = 0;
	}
	
	public void addCadens(int cadens) {
		this.cadens += cadens;
	}
	
	public void setCadens(int cadens) {
		this.cadens = cadens;
	}
	
	public void removeCadens(int cadens) {
		this.cadens -= cadens;
	}
	
}
