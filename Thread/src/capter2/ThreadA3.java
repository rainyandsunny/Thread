package capter2;

public class ThreadA3 extends Thread {

	private MyObject object;
	
	public ThreadA3(MyObject object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodA();
	}
}
