package capter7;

public class MyThread3 extends Thread {

	@Override
	public void run() {
		MyService.serviceMethod();
	}
}
