package capter3;

public class ThreadC3 extends Thread {

	private ThreadB4 threadB;
	
	public ThreadC3(ThreadB4 threadB){
		super();
		this.threadB = threadB;
	}
	
	@Override
	public void run(){
		threadB.interrupt();
	}
	
}
