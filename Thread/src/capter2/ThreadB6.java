package capter2;

public class ThreadB6 extends Thread {
	private MyObject3 object;
	
	public ThreadB6(MyObject3 object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodB();
	}
}
