package capter2;

public class ThreadB5 extends Thread {

	private MyObject2 object;
	
	public ThreadB5(MyObject2 object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodB();
	}
}
