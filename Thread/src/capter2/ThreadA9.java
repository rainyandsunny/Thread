package capter2;

public class ThreadA9 extends Thread {

	private Sub1 sub;
	
	public ThreadA9(Sub1 sub){
		super();
		this.sub = sub;
	}
	
	@Override
	public void run(){
		sub.serviceMethod();
	}
}
