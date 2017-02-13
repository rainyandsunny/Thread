package capter3;

public class ThreadA9 extends Thread {

	private ThreadB6 b;
	
	public ThreadA9(ThreadB6 b){
		super();
		this.b = b;
	}
	
	@Override
	public void run(){
		try{
			synchronized (b) {
				System.out.println("begin A ThreadName="
						+ Thread.currentThread().getName() + " "
						+ System.currentTimeMillis());
				Thread.sleep(5000);
				System.out.println("end A ThreadName="
						+ Thread.currentThread().getName() + " "
						+ System.currentTimeMillis());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
