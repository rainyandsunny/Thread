package capter2;

public class ThreadA8 extends Thread {

	private Service1 service;
	
	public ThreadA8(Service1 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.testMethod();
	}
}
