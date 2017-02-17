package capter4;

public class ThreadB2 extends Thread {

	private MyService6 service;

	public ThreadB2(MyService6 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.awaitB();
	}
}
