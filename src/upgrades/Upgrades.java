package upgrades;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Upgrades {
	//cadens per click
	private int cpc;
	private int cost;
	private String name;
	private String filename;
	private int xscale=25;
	private int yscale=25;
	private ImageIcon icon;
	private int amount;

	private HashSet<Upgrade> upgrades = new HashSet<Upgrade>();
	
	public Upgrades(int level) {
		
			switch(level)
			{
				case 1:
					cpc = 2;
					name = "Chris";
					filename = "Chris.jpg";
				
				case 2:
					cpc = 4;
					name = "Hunter";
					filename = "Hunter.jpg";
				case 3:
					cpc = 8;
					name = "SirEvrim";
					filename = "SirEvrim.jpg";
				case 4:
					cpc = 16;
					name = "LightskinCaden";
					filename = "LightskinCaden.jpg";
				
			}
			
			BufferedImage img = null;
			try
			{
				img = ImageIO.read(new File(filename));
			}
			catch(IOException e)
			{	
				System.out.print("Error loading image '" + filename + "'");
			}
			
			Image scaled = img.getScaledInstance(xscale, yscale, Image.SCALE_SMOOTH);
			
			icon = new ImageIcon(scaled); 
		}
	
	
}
