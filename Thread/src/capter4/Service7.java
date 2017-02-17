package capter4;

import java.util.concurrent.locks.ReentrantLock;

public class Service7 {

	private ReentrantLock lock;
	
	public Service7(boolean isFair){
		super();
		lock = new ReentrantLock();
	}
	
	public void serviceMethod(){
		try{
			System.out.println(lock.isHeldByCurrentThread());
			lock.lock();
			System.out.println(lock.isHeldByCurrentThread());
		}finally{
			lock.unlock();
		}
	}
}
