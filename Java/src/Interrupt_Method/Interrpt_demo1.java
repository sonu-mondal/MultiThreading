package Interrupt_Method;

public class Interrpt_demo1 {

	public static void main(String[] args) {
		Mythread_Demo1 mt=new Mythread_Demo1();
				mt.start();
		mt.interrupt();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
		

	}

}
