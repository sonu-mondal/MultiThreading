package Multithreading_Practice;

public class MyThread_Yield_Demo1 extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child thread");
			Thread.yield();//calling yield method that will pause the current executing 
			//thread to pause and give chance to other waiting thread.
		}
	}
}
