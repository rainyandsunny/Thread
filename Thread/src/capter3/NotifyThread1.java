package capter3;

public class NotifyThread1 extends Thread {

	private Object lock;
	
	public NotifyThread1(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run(){
		synchronized (lock) {
			lock.notify();
		}
	}
}
