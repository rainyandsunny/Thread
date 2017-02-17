package capter4;

public class ThreadB extends Thread {
	private MyService1 service;
	
	public ThreadB(MyService1 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.methodB();
	}
}
