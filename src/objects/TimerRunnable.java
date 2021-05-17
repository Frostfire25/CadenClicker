package objects;

import java.util.TimerTask;

import graphics.Main;

public class TimerRunnable extends TimerTask {

	private Game game;
	
	@Override
	public void run() {
		game = Main.game;
		
		System.out.println(game == null);
		
		//Makes sure the player has a game loaded
		if(game == null)
			return;
		
		game.workers.stream()
			.filter(n -> (n.amount > 0))
			.forEach(n -> {
			
				game.addCadens(n.amount * n.getCps());
		});
		
		System.out.println(game.getCadens());
	}

}
