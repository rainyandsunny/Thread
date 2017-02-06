package capter2;

public class ThreadB4 extends Thread {
	private MyObject1 object;
	
	public ThreadB4(MyObject1 object){
		super();
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.methodA();
	}
}
