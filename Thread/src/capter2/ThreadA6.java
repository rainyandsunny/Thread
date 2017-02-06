package capter2;

public class ThreadA6 extends Thread {

	private MyObject3 object;
	
	public ThreadA6(MyObject3 object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodA();
	}
}
