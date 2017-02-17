package capter4;

public class MyThreadA extends Thread {

	private MyService7 myService;
	
	public MyThreadA(MyService7 myService){
		super();
		this.myService = myService;
	}
	
	@Override
	public void run(){
		for(int i = 0; i < Integer.MAX_VALUE; i++){
			myService.set();
		}
	}
}
