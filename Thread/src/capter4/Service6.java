package capter4;

import java.util.concurrent.locks.ReentrantLock;

public class Service6 {

	private ReentrantLock lock;
	
	public Service6(boolean isFair){
		super();
		lock = new ReentrantLock(isFair);
	}
	
	public void serviceMethod(){
		try{
			lock.lock();
			System.out.println("��ƽ�������" + lock.isFair());
		}finally{
			lock.unlock();
		}
	}
	
}
