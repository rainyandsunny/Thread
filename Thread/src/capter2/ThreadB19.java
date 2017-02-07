package capter2;

public class ThreadB19 extends Thread {

	private Service7 service;
	
	public ThreadB19(Service7 service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printB();
	}
}
