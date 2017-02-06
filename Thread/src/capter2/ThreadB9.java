package capter2;

public class ThreadB9 extends Thread {

	private Sub1 sub;
	
	public ThreadB9(Sub1 sub){
		super();
		this.sub = sub;
	}
	
	@Override
	public void run(){
		sub.serviceMethod();
	}
}
