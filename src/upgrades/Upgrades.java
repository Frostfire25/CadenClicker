package upgrades;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.*;

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
	private int level;

	private HashSet<Upgrade> upgrades = new HashSet<Upgrade>();
	
	public Upgrades(int level) 
	{
			this.level = level;
			
			UpdateLevel();
			
		}
	public String getFileName()
	{
		return filename;
	}
	
	public void SetLevel(int level)
	{
		this.level = level;
		UpdateLevel();
	}
	
	public void UpdateLevel()
	{
		switch(this.level)
		{
			case 1: {
				cpc = 1;
				name = "Caden";
				filename = "Caden.jpg";
				cost = 0;
			} break;
			case 2: {
				cpc = 10;
				name = "CoolCaden";
				filename = "CoolCaden.jpg";
				cost = 1000;
			} break;
			case 3: {
				cpc = 100;
				name = "TravisCaden";
				filename = "TravisCaden.jpg";
				cost = 25000;
			} break;
			case 4: {
				cpc = 1000;
				name = "HoodCaden";
				filename = "HoodCaden.jpg";
				cost = 1000000;
			} break;
			case 5: {
				cpc = 10000;
				name = "HoodMonaLisa";
				filename = "HoodMonaLisa.jpg";
				cost = 10000000;
			} break;
		}
	}
	
	public int GetCPC()
	{
		return this.cpc;
	}
	
	public int GetLevel()
	{
		return this.level;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public int GetCost()
	{
		return cost;
	}
}
