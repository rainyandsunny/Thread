package capter3;

public class NotifyThread extends Thread{

	private Object lock;
	
	public NotifyThread(Object lock){
		super();
		this.lock = lock;
	}
	
	@Override
	public void run(){
		Service1 service = new Service1();
		service.synNotifyMethod(lock);
	}
}
