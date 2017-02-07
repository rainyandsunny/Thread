package capter2;

public class ThreadC extends Thread {

	private Service6 service;
	
	public ThreadC(Service6 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		
		service.printC();
	}
	
}
