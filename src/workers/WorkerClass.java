package workers;

import java.awt.Image;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class WorkerClass {
	private int cps;
	private String name;
	private String filename;
	private int xscale=25;
	private int yscale=25;
	private ImageIcon icon;
	private int amount;
	//implement cost?
	private int cost;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public WorkerClass()
	{
		
		cps = -1;
		name = "None";

	}
	
	public WorkerClass(int level)
	{
		switch(level)
		{
			case 1:
				cps = 1;
				name = "Chris";
				filename = "Chris.jpg";
			
			case 2:
				cps = 5;
				name = "Hunter";
				filename = "Hunter.jpg";
			case 3:
				cps = 8;
				name = "SirEvrim";
				filename = "SirEvrim.jpg";
			case 4:
				cps = 12;
				name = "Tanner";
				filename = "Tanner.jpg";
			case 5:
				cps = 25;
				name = "LostDolla";
				filename = "LostDolla.jpg";
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
