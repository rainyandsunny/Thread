package capter4;

public class ThreadA4 extends Thread {

	private MyService6 service;
	
	public ThreadA4(MyService6 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.awaitA();
	}
}
