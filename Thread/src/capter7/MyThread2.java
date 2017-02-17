package capter7;

public class MyThread2 extends Thread {

	@Override
	public void run(){
		MyService.serviceMethod();
	}
}
