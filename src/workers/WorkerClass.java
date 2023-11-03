package workers;

import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import graphics.Main;
import objects.Game;

public class WorkerClass implements ActionListener {
	private int cps;

	private String name;
	private String filename;
	private int xscale=50;
	private int yscale=50;
	private ImageIcon icon;
	public int amount;
	public int price;

	//352130d8-58e4-4c60-8a5f-ee22fcc47dd8
	
	public WorkerClass()
	{
		
		cps = -1;
		name = "None";

	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println(e.getSource());
		
		if(Main.game.getCadens() >= this.price) {
			//Can purchase 1
			amount++;
			Main.game.removeCadens(price);
			Main.gui.contentPanel.displayText("You have purchased one Chris Worker.", "green");
			
			// Add in the worker to the GUI
			Point point = getRandomPoint(Main.gui.contentPanel);
			JLabel label = new JLabel("Worker");
			label.setIcon(icon);
			label.setBounds((int)point.getX(), (int)point.getY(), xscale, yscale);
			label.setText("Worker here!");
			Main.gui.contentPanel.add(label);
			Main.gui.contentPanel.update();

			System.out.println(point);
			System.out.println("added the picture to the page");
		} else {
			//Can not purchase 1
			System.out.println("here " + price);
			Main.gui.contentPanel.displayNotEnoughCadens();
		}
		
	}

	public static Point getRandomPoint(JPanel panel) {
        int width = panel.getWidth();
        int height = panel.getHeight();
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);
        return new Point(x, y);
    }
	
	public WorkerClass(int level)
	{
		switch(level)
		{
			case 1: {
				cps = 1;
				name = "Chris";
				filename = "Chris.jpg";
				price = 100;
			} break;
			
			case 2: {
				cps = 5;
				name = "Hunter";
				filename = "Hunter.jpg";
				price = 1500;
			} break;
				
			case 3: {
				cps = 8;
				name = "SirEvrim";
				filename = "SirEvrim.jpg";
				price = 30000;
			} break;
				
			case 4:
				cps = 12; {
				name = "Tanner";
				filename = "Tanner.jpg";
				price = 120000;
			} break;
				
			case 5: {
				cps = 25;
				name = "LostDolla";
				filename = "LostDolla.jpg";
				price = 2500000;
			} break;
				
		}
		
		BufferedImage img = null;
		try
		{
			img = ImageIO.read(new File("resources/workers/"+filename));
		}
		catch(IOException e)
		{	
			System.out.print("Error loading image '" + filename + "'");
		}
		
		//Wating for images
		
		
		Image scaled = img.getScaledInstance(xscale, yscale, Image.SCALE_SMOOTH);
		icon = new ImageIcon(scaled); 
	}
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getCps() {
		return cps;
	}
	
	//Returns amount of Cadens needed
	public int getPrice() {
		return price;
	}

}
