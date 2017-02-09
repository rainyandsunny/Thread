package capter3;

public class ThreadB2 extends Thread {

	private Object lock;
	
	public ThreadB2(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service service = new Service();
		service.testMethod(lock);
	}
}
