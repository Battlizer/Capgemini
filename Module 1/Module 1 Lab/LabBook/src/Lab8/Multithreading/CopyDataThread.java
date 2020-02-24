//  Write a program to do the following operations using Thread: ï‚· Create an user defined Thread class called as â€œCopyDataThread .javaâ€� . 
// ï‚· This class will be designed to copy the content from one file â€œsource.txt â€� to another file â€œtarget.txtâ€� and after every 10 characters 
// copied,   â€œ10 characters are copiedâ€� message  will be shown to user.(Keep delay of 5 seconds after every 10 characters  read.) 
// ï‚· Create another class â€œFileProgram.javaâ€� which will create above thread. Pass required File Stream classes to  CopyDataThread constructor 
// and implement the above functionality. 


package Lab8.Multithreading;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyDataThread extends Thread {
	
	InputStream is = null;
	OutputStream os = null;
	public CopyDataThread(InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
	}

	public void run() {
			
			int read, count = 0;
			try {
				while((read=is.read())>0) {
					count++;
					if(count == 10) {
						os.write(read);
						System.out.println("10 characters are copied");
						Thread.sleep(5000);
					}
					else {
						os.write(read);
					}
					
				}
				os.flush();
			} catch (IOException | InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
	}
}
