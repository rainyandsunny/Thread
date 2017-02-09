package capter3;

public class ThreadA3 extends Thread {

	private Object lock;
	public ThreadA3(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service1 service = new Service1();
		service.testMethod(lock);
	}
}
