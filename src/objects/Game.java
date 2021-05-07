package objects;

public class Game {

	private int cadens;	
	
	private int worker1Amount = 0;
	
	public Game() {
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
