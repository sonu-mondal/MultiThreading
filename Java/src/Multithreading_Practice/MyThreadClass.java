package Multithreading_Practice;

public class MyThreadClass extends Thread{

	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
	
	//Overloading the thread class run method
	public void run(String str) {
		for(int i=0;i<10;i++) {
			System.out.println(str);
		}
	}
}
