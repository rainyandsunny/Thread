package capter2;

public class ThreadB20 extends Thread {

	private Service8 service;
	
	public ThreadB20(Service8 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.print("AA");
	}
}
