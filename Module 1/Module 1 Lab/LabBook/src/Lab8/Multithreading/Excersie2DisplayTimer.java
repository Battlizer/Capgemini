// Write a thread program to display timer where timer will get refresh after every
// 10seconds.( Use Runnable implementation ) 


package Lab8.Multithreading;
import java.util.Date;


class TimeDisplay implements Runnable {
	
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


public class Excersie2DisplayTimer {
	
	public static void main(String[] args) {
		TimeDisplay td = new TimeDisplay();
		Thread t = new Thread(td);
		t.start();
	}
}
