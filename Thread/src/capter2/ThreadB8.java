package capter2;

public class ThreadB8 extends Thread {

	private Service1 service;
	
	public ThreadB8(Service1 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.testMethod();
	}
}
