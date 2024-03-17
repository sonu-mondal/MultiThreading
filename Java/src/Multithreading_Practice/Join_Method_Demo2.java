package Multithreading_Practice;
//So here we are calling join method from the child thread which means child thread will
//wait untill the completion of the main thread
public class Join_Method_Demo2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread_Join_Demo2.mt=Thread.currentThread();
		
		MyThread_Join_Demo2 t=new MyThread_Join_Demo2();
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread....");
			Thread.sleep(2000);
		}

	}

}
