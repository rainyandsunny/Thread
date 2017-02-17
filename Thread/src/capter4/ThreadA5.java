package capter4;

public class ThreadA5 extends Thread {

	private Service11 service;
	
	public ThreadA5(Service11 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.read();
	}
	
}
