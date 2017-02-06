package capter2;

public class ThreadB12 extends Thread {

	private Service3 service;
	
	public ThreadB12(Service3 service){
		
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.b();
	}
}
