package capter2;

public class ThreadB3 extends Thread {

	private MyObject object;
	
	public ThreadB3(MyObject object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodA();
	}
}
