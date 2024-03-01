package Multithreading_Practice;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception {
		MyThreadClass t=new MyThreadClass();
		Thread.currentThread().setPriority(10);
		t.start();
//		t.setPriority(10);
		//t.sleep(5000);
		//t.run();//when we used run() method in place of start() method then new thread wont be created and run() method will be executed just like a normal method call
		
		//t.run("Sonu Mondal");//overloading the run() method
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
