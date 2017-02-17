package capter4;

public class ThreadB3 extends Thread {
	private Service10 service;

	public ThreadB3(Service10 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.notifyMethod();
	}

}
