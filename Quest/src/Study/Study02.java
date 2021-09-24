package Study;

import java.util.Timer;
import java.util.TimerTask;

public class Study02 {

	public static void main(String[] args) {
		System.out.println(1);
		
		Timer timer1=new Timer();
		TimerTask task1 = new TimerTask() {
			public void run() {
				System.out.println(2);
				timer1.cancel();
			}
		};
		
		timer1.schedule(task1, 3000);
	}

}
