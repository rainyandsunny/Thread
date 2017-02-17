package capter4;

public class ThreadA2 extends Thread {

	private MyService4 service;
	
	public ThreadA2(MyService4 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.await();
	}
}
