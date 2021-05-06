package objects;

import java.util.TimerTask;

public class TimerRunnable extends TimerTask {

	@Override
	public void run() {
		System.out.println("Ran " + System.currentTimeMillis());
	}

}
