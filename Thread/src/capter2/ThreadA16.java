package capter2;

public class ThreadA16 extends Thread {
	private Service5 service;
	private MyObject4 object;
	
	public ThreadA16(Service5 service,MyObject4 object){
		super();
		this.service = service;
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		service.testMethod1(object);
	}
}
