package capter2;

public class ThreadA15 extends Thread {

	private Service4 service;
	private MyObject object;
	
	public ThreadA15(Service4 service,MyObject object){
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
