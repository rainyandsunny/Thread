package capter2;

public class ThreadB21 extends Thread {
	private Service9 service;

	public ThreadB21(Service9 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.print(new Object());
	}
}
