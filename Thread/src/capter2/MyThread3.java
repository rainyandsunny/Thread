package capter2;

public class MyThread3 extends Thread {

	private MyService2 myService;
	
	public MyThread3(MyService2 service){
		super();
		this.myService = service;
	}
	
	@Override
	public void run(){
		myService.addNum();
	}
}
