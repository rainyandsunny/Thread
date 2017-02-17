package capter4;

public class ThreadBB extends Thread {
	private MyService1 service;

	public ThreadBB(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.methodB();
	}
}
