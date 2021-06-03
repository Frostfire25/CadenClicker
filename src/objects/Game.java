package objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import graphics.Main;
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
	
	public WorkerClass chrisworker;
	public WorkerClass hunterworker;
	public WorkerClass sirevrimworker;
	public WorkerClass tannerworker;
	public WorkerClass lostdollaworker;
	

	public HashSet<WorkerClass> workers = new HashSet<>();
	
	/*
	 * Button upgrades
	 */
	
	private Upgrades upgrade;
	
	
	/*
	 * Constructors
	 */
	
	public Game() {
		this(UUID.randomUUID(), 0, 0, 0, 0, 0, 0, 1);
	}
	
	public Game(UUID uuid, 
			int cadens, int worker1Amount, int worker2Amount, int worker3Amount, int worker4Amount, int worker5Amount,
			int upgradeLevel
	
			
			
			) {
		
		//Data storage
		this.uuid = uuid;
		this.cadens = cadens;
		
		
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
		this.upgrade = new Upgrades(upgradeLevel);
		this.cpc = upgrade.GetCPC();
		
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
		Upgrades upgrade = new Upgrades(this.upgrade.GetLevel()+1);
		
		if((this.cadens - upgrade.GetCost()) >= 0)
		{

			this.upgrade.SetLevel(this.upgrade.GetLevel()+1);
			this.cpc = upgrade.GetCPC();
			this.cadens -= upgrade.GetCost();
			//Main.gui.iconscadens(upgrade.getFileName(),250,250);
			//Main.gui.changeButton();

		}
		else
		{
			System.out.println("Not enough cadens!");
			Main.gui.contentPane.displaeyNotEnoughCadens();
		}
	}
	
	public Upgrades GetUpgrade()
	{
		return upgrade;
	}
	
	public int getUpgradeLevel() {
		return upgrade.GetLevel();
	}
}
