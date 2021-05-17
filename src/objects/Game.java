package objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import upgrades.Upgrades;
import workers.WorkerClass;

public class Game {

	//ID 
	private UUID uuid;
	
	/*
	 * Game information
	 */
	
	private int cadens;	
	
	public int cpc;
	
	/*
	 * Workers
	 */
	
	private WorkerClass chrisworker;
	private WorkerClass hunterworker;
	private WorkerClass sirevrimworker;
	private WorkerClass tannerworker;
	private WorkerClass lostdollaworker;
	

	public HashSet<WorkerClass> workers = new HashSet<>();
	
	/*
	 * Button upgrades
	 */
	
	private Upgrades upgradeLevel;
	
	
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
		
		
		//Workers
		this.chrisworker = new WorkerClass(1);
		this.chrisworker.setAmount(worker1Amount);
		this.workers.add(chrisworker);
		
		this.hunterworker = new WorkerClass(2);
		this.hunterworker.setAmount(worker2Amount);
		this.workers.add(hunterworker);

		this.sirevrimworker = new WorkerClass(3);
		this.sirevrimworker.setAmount(worker3Amount);
		this.workers.add(sirevrimworker);
		
		this.tannerworker = new WorkerClass(4);
		this.tannerworker.setAmount(worker4Amount);
		this.workers.add(tannerworker);

		this.lostdollaworker = new WorkerClass(5);
		this.lostdollaworker.setAmount(worker5Amount);
		this.workers.add(lostdollaworker);

		//Upgrades
		this.upgradeLevel = new Upgrades(1);
		this.cpc = upgradeLevel.GetCPC();
		
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
	
	public int getCadens() {
		return cadens;
	}
	
	public UUID getUUID() {
		return uuid;
	}
	
	public void Upgrade()
	{
		this.upgradeLevel.SetLevel(this.upgradeLevel.GetLevel()+1);
		this.cpc = upgradeLevel.GetCPC();
	}
	
	public Upgrades GetUpgrade()
	{
		return upgradeLevel;
	}
}
