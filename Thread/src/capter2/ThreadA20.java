package capter2;

public class ThreadA20 extends Thread {

	private Service8 service;
	
	public ThreadA20(Service8 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.print("AA");
	}
}
