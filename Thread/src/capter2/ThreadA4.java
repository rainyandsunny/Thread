package capter2;

public class ThreadA4 extends Thread {
	private MyObject1 object;
	
	public ThreadA4(MyObject1 object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodA();
	}
}
