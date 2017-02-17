package capter4;

public class ThreadB5 extends Thread {

	private Service12 service;
	
	public ThreadB5(Service12 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.write();
	}
}
