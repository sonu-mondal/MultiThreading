package Thread_Using_Runnable_Interface;

//Implementing the thread using Runnable Interface
public class ThreadRunnable {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" Thread ");
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.start();
		Thread.currentThread().setName("Sonu's thread");
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread - Runnable Interface");
		}
		System.out.println(Thread.currentThread().getName());
		

	}

}
