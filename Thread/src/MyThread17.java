
public class MyThread17 extends Thread {

	@Override
	public void run(){
		System.out.println("MyThread2 run priority=" + this.getPriority());
	}
}
