package capter3;

public class ThreadA7 extends Thread {

	private ThreadB5 b;
	
	public ThreadA7(ThreadB5 b){
		super();
		this.b = b;
	}
	
	@Override
	public void run(){
		
		try{
			synchronized (b) {
				b.start();
				Thread.sleep(6000);
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
