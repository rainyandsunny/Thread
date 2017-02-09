package capter2;

public class ThreadA25 extends Thread {

	private Service12 service;
	
	public ThreadA25(Service12 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.runMethod();
	}
}
