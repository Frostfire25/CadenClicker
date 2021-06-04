package objects;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import graphics.Main;

public class Timer {

	/*
	 * This class runs the timer
	 * 
	 * Runs 1x second
	 */

	private java.util.Timer timer;
	
	public Timer() {
		this.timer = new java.util.Timer();
		timer.schedule(new TimerRunnable(), 2000L, 1000L);
		
		new java.util.Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				Main.gui.contentPanel.updateCount();			
			}
		
		}, 2000L, 100L);
	}
	
}
