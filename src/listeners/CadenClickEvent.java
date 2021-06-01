package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import graphics.Main;
import objects.Game;

public class CadenClickEvent implements ActionListener {

	private Game game = Main.game;
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		game.addCadens(Main.game.cpc);
		Main.gui.contentPane.updateCount();
	}
}