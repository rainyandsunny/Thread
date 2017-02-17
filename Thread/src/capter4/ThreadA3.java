package capter4;

public class ThreadA3 extends Thread {

	private MyService5 service;
	
	public ThreadA3(MyService5 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.awaitA();
	}
}
