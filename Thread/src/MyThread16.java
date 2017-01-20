
public class MyThread16 extends Thread {

	@Override
	public void run(){
		System.out.println("MyThread1 run priority="+this.getPriority());
		MyThread17 thread2 = new MyThread17();
		thread2.start();
	}
}
