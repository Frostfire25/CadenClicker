package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graphics.Main;
import objects.Game;

public class UpgradeClickEvent implements ActionListener {

	private Game game = Main.game;
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{	
		game.Upgrade();
		System.out.println(game.getCadens());
	}
}