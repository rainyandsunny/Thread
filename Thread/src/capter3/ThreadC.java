package capter3;

public class ThreadC extends Thread {
	private Object lock;

	public ThreadC(Object lock) {
		super();
		this.lock = lock;
	}

	@Override
	public void run() {
		Service3 service = new Service3();
		service.testMethod(lock);
	}
}
