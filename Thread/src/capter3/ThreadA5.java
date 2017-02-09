package capter3;

public class ThreadA5 extends Thread {

	private Object lock;
	
	public ThreadA5(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service3 service = new Service3();
		service.testMethod(lock);
	}
}
