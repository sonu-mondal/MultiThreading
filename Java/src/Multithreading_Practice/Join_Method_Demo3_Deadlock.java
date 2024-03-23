package Multithreading_Practice;
//Example of deadlock condition where main thread calls join method on child thread object
//and child thread calls join method on main thread object so in this scenario both the 
//thread will wait forever and the program will be sticked/paused and this condition is called
//DEADLOCK.
public class Join_Method_Demo3_Deadlock {

	public static void main(String[] args) throws InterruptedException {
		DeadLock_Condition.mt=Thread.currentThread();
		DeadLock_Condition thread=new DeadLock_Condition();
		thread.start();
		thread.join();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
			Thread.sleep(1000);
		}

	}

}
