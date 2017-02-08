package capter2;

public class ThreadA21 extends Thread {

	private Service9 service;
	
	public ThreadA21(Service9 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.print(new Object());
	}
}
