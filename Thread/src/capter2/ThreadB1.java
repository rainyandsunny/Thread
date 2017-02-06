package capter2;

public class ThreadB1 extends Thread {
	private HasSelfPrivateNum1 numRef;
	
	public ThreadB1(HasSelfPrivateNum1 numRef){
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run(){
		super.run();
		numRef.addI("b");
	}
}
