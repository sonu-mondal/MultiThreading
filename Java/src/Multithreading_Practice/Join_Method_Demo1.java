package Multithreading_Practice;
//So here we are calling join method from the main thread which means main thread will
//wait untill the completion of the child thread
public class Join_Method_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		MyThread_Join_Demo1 t=new MyThread_Join_Demo1();
		t.start();
		t.join();//so here main thread calls join method means main thread will wait untill
		//completion of the child thread
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
