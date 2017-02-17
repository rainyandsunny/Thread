package capter6;

public class Run7 {

	public static void main(String[] args) {
		
		MyThread6 thread1 = new MyThread6();
		MyThread6 thread2 = new MyThread6();
		MyThread6 thread3 = new MyThread6();
		MyThread6 thread4 = new MyThread6();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
	}

}
