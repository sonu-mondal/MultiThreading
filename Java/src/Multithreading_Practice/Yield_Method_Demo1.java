package Multithreading_Practice;

public class Yield_Method_Demo1 {
	
	public static void main(String[] args) {
		MyThread_Yield_Demo1 t=new MyThread_Yield_Demo1();
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
			//Thread.yield();
		}

	}

}
