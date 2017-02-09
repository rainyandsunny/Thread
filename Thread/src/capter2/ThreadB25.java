package capter2;

public class ThreadB25 extends Thread {

	private Service12 service;
	
	public ThreadB25(Service12 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.stopMethod();
	}
}
