package capter4;

public class MyThread1 extends Thread {

	private MyService3 myService;
	
	public MyThread1(MyService3 myService){
		super();
		this.myService = myService;
	}
	
	@Override
	public void run(){
		myService.waitMethod();
	}
}
