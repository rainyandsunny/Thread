package capter3;

public class ThreadC4 extends Thread {

	private ThreadB5 threadB;
	
	public ThreadC4(ThreadB5 threadB){
		super();
		this.threadB = threadB;
	}
	
	@Override
	public void run(){
		threadB.bService();
	}
}
