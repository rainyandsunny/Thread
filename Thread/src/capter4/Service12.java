package capter4;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service12 {

	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	
	public void write(){
		
		try{
			try{
				lock.writeLock().lock();
				System.out.println("»ñµÃÐ´Ëø" + Thread.currentThread().getName()
						+ " " + System.currentTimeMillis());
				Thread.sleep(10000);
			}finally{
				lock.writeLock().unlock();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
