package capter4;

public class ThreadB4 extends Thread {

	private Service11 service;
	
	public ThreadB4(Service11 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.read();
	}
}
