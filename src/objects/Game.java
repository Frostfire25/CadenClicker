package objects;

import java.util.HashMap;
import java.util.UUID;

import workers.WorkerClass;

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
	
	private WorkerClass chrisworker;
	private WorkerClass hunterworker;
	private WorkerClass sirevrimworker;
	private WorkerClass tannerworker;
	private WorkerClass lostdollaworker;
	
	/*
	 * Upgrades
	 */
	
	/*
	 * Constructors
	 */
	
	public Game() {
		this(UUID.randomUUID(), 0, 0, 0, 0, 0, 0);
	}
	
	public Game(UUID uuid, 
			int cadens, int worker1Amount, int worker2Amount, int worker3Amount, int worker4Amount, int worker5Amount
			
			) {
		this.uuid = uuid;
		this.cadens = 0;
		
		this.chrisworker = new WorkerClass(1);
		this.chrisworker.setAmount(worker1Amount);
		
		this.hunterworker = new WorkerClass(2);
		this.hunterworker.setAmount(worker2Amount);

		this.sirevrimworker = new WorkerClass(3);
		this.sirevrimworker.setAmount(worker3Amount);
		
		this.tannerworker = new WorkerClass(4);
		this.tannerworker.setAmount(worker4Amount);

		this.lostdollaworker = new WorkerClass(5);
		this.lostdollaworker.setAmount(worker5Amount);

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
