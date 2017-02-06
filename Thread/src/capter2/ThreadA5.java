package capter2;

public class ThreadA5 extends Thread {

	private MyObject2 object;
	
	public ThreadA5(MyObject2 object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodA();
	}
}
