package capter3;

public class ThreadA4 extends Thread {

	private Object lock;
	
	public ThreadA4(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service2 service = new Service2();
		service.testMethod(lock);
	}
}
