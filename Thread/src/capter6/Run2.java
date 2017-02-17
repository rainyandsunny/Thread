package capter6;

public class Run2 {

	public static void main(String[] args) {
		
		MyThread1 t1 = new MyThread1();
		MyThread1 t2 = new MyThread1();
		MyThread1 t3 = new MyThread1();
		t1.start();
		t2.start();
		t3.start();
	}

}
