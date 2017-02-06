package capter2;

public class ThreadA1 extends Thread{
	private HasSelfPrivateNum1 numRef;
	public ThreadA1(HasSelfPrivateNum1 numRef){
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run(){
		super.run();
		numRef.addI("a");
	}
}
