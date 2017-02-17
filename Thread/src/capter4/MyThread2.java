package capter4;

public class MyThread2 extends Thread {

	private Service9 service;
	
	public MyThread2(Service9 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		
		service.testMethod();
	}
}
