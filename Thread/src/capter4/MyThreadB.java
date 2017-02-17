package capter4;

public class MyThreadB extends Thread {

	private MyService7 myService;

	public MyThreadB(MyService7 myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			myService.get();
		}
	}
}
