package capter2;

public class ThreadA23 extends Thread {

	private MyService1 service;
	
	public ThreadA23(MyService1 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.testMethod();
	}
	
}
