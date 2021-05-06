package objects;

import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

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
	}
	
}
