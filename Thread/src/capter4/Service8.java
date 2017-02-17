package capter4;

import java.util.concurrent.locks.ReentrantLock;

public class Service8 {

	private ReentrantLock lock;
	
	public Service8(boolean isFair){
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try{
			System.out.println(lock.isLocked());
			lock.lock();
			System.out.println(lock.isLocked());
		}finally{
			lock.unlock();
		}
	}
}
