package capter2;

public class ThreadA18 extends Thread {

	private Service6 service;
	
	public ThreadA18(Service6 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printA();
	}
}
