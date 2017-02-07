package capter2;

public class ThreadB18 extends Thread {

	private Service6 service;
	
	public ThreadB18(Service6 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printB();
	}
}
