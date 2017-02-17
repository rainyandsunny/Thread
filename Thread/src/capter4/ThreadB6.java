package capter4;

public class ThreadB6 extends Thread {

	private Service13 service;
	
	public ThreadB6(Service13 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.read();
	}
}
