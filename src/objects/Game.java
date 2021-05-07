package objects;

import java.util.HashMap;

import workers.WorkerClass;

public class Game {

	private int cadens;	
		
	private WorkerClass chrisworker;
	private WorkerClass hunterworker;
	private WorkerClass sirevrimworker;
	private WorkerClass tannerworker;
	private WorkerClass lostdollaworker;

	
	public Game() {
		this.cadens = 0;
		this.chrisworker = new WorkerClass(1);
		this.hunterworker = new WorkerClass(2);
		this.sirevrimworker = new WorkerClass(3);
		this.tannerworker = new WorkerClass(4);
		this.lostdollaworker = new WorkerClass(5);
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
