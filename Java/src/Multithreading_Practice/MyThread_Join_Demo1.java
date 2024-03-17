package Multithreading_Practice;

public class MyThread_Join_Demo1 extends Thread {
	
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
			
			try {
				Thread.sleep(1000);//we sleep child thrread for 2 sec each time 
			}
			catch(InterruptedException e) {
				
			}
		}
	}
}
