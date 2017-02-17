package capter4;

public class MyThreadA2 extends Thread {

	private Service10 service;
	
	public MyThreadA2(Service10 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.waitMethod();
	}
}
