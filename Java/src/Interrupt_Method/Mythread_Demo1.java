package Interrupt_Method;

public class Mythread_Demo1 extends Thread{

	public void run() {
		try {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread");
			Thread.sleep(1000);
		}
		}
		catch(InterruptedException e) {
			System.out.println("Thread get Interrupted...");
		}
	}
}
