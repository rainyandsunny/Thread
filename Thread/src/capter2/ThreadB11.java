package capter2;

public class ThreadB11 extends Thread {

	private Service2 service;
	
	public ThreadB11(Service2 service){
		super();
		this.service = service;
	}
	
	@Override
	public void run(){
		service.setUsernamePassword("b", "bb");
	}
}
