package capter2;

public class ThreadA12 extends Thread {

	private Service3 service;
	
	public ThreadA12(Service3 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.a();
	}
}
