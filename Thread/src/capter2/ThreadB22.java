package capter2;

public class ThreadB22 extends Thread {

	private Service10 service;
	
	public ThreadB22(Service10 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.methodB();
	}
}
