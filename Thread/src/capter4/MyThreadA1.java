package capter4;

public class MyThreadA1 extends Thread {
	private MyService8 myService;

	public MyThreadA1(MyService8 myService) {
		super();
		this.myService = myService;
	}

	@Override
	public void run() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			myService.set();
		}
	}
}
