package capter2;

public class ThreadA19 extends Thread {

	private Service7 service;
	
	public ThreadA19(Service7 service){
		this.service = service;
	}
	
	@Override
	public void run(){
		service.printA();
	}
}
