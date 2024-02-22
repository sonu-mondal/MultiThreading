package Multithreading_Practice;

public class ThreadDemo1 {

	public static void main(String[] args) throws Exception {
		MyThreadClass t=new MyThreadClass();
		t.start();
		t.sleep(5000);
		
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}

	}

}
