package Lab8.Multithreading;
import java.util.Date;


class TimerDisplay implements Runnable {
	public void run() {
		for( ;  ;  ) {
			try {
				Date d = new Date();
				System.out.println(d);
	Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
				}
		}
	}
}

class Timer {

	public static void main(String[] args) {
		TimerDisplay td = new TimerDisplay();
		Thread t = new Thread(td);
		t.start();
	}
}