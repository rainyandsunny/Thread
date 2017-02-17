package capter4;

public class ThreadAA extends Thread {

	private MyService1 service;
	
	public ThreadAA(MyService1 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.methodA();
	}
}
