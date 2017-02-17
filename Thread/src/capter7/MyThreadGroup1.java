package capter7;

public class MyThreadGroup1 extends ThreadGroup {

	public MyThreadGroup1(String name) {
		super(name);
	}

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		super.uncaughtException(t, e);
		System.out.println("线程组的异常处理");
		e.printStackTrace();
	}
	
	
}
