package capter4;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service11 {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void read(){
		
		try{
			try{
				lock.readLock().lock();
				System.out.println("��ö���" + Thread.currentThread().getName()
						+ " " + System.currentTimeMillis());
				Thread.sleep(10000);
			}finally{
				lock.readLock().unlock();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
