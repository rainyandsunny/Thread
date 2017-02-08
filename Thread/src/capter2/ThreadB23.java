package capter2;

public class ThreadB23 extends Thread {

	private MyService1 service;

	public ThreadB23(MyService1 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		service.testMethod();
	}
}
