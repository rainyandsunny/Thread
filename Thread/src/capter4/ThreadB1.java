package capter4;

public class ThreadB1 extends Thread {
	private MyService5 service;

	public ThreadB1(MyService5 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}
}
