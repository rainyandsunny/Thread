package capter4;

public class ThreadA1 extends Thread {

	private MyService2 service;
	
	public ThreadA1(MyService2 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.await();
	}
	
	
}
