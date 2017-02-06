package capter2;

public class ThreadA11 extends Thread {

	private Service2 service;
	
	public ThreadA11(Service2 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.setUsernamePassword("a", "aa");
	}
}
