package Thread_Using_Runnable_Interface;

//Implementing the thread using Runnable Interface
public class ThreadRunnable {

	public static void main(String[] args) {
		//System.out.println(Thread.currentThread().getName()+" Thread ");
		//System.out.println("Thread priority is : "+Thread.currentThread().getPriority());
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.setPriority(10);//by default main thread has priority 5 and here we are setting child thread priority as 10 
		//so child thread will execute first
		
		t.start();
//		Thread.currentThread().setPriority(10);
		Thread.currentThread().setName("Sonu's thread");
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread - Runnable Interface");
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		

	}

}
