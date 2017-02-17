package capter4;

public class MyThreadB1 extends Thread {
	private MyService8 myService;

	public MyThreadB1(MyService8 myService) {
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
