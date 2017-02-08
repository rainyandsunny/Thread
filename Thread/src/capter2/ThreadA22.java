package capter2;

public class ThreadA22 extends Thread {

	private Service10 service;
	
	public ThreadA22(Service10 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.methodA();
	}
}
