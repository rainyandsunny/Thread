package capter4;

public class ThreadA6 extends Thread {
	private Service12 service;

	public ThreadA6(Service12 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.write();
	}
}
