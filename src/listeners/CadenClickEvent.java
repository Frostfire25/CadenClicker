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
<<<<<<< HEAD
		Main.gui.updateCount();
		System.out.println(game.getCadens());
=======
		Main.gui.contentPane.updateCount();
>>>>>>> ece7764628b8a419ef545abc8ae51ba0f13d4c05
	}
}