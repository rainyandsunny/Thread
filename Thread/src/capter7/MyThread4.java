package capter7;

public class MyThread4 extends Thread {

	@Override
	public void run(){
		
		try{
			synchronized (Lock.lock) {
				Lock.lock.wait();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
