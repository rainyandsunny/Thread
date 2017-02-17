package capter4;

public class ThreadA extends Thread {

	private MyService1 service;
	
	public ThreadA(MyService1 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.methodA();
	}
}
