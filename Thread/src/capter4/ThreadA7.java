package capter4;

public class ThreadA7 extends Thread {

	private Service13 service;

	public ThreadA7(Service13 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}
}
