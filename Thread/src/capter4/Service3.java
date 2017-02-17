package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service3 {

	private ReentrantLock lock = new ReentrantLock();
	private Condition newCondition = lock.newCondition();
	
	public void waitMethod(){
		
		try{
			lock.lock();
			newCondition.await();
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void notifyMethod(){
		
		try{
			lock.lock();
			System.out.println("��" + lock.getWaitQueueLength(newCondition)
					+ "���߳����ڵȴ�newCondition");
			newCondition.signal();
		}finally{
			lock.unlock();
		}
	}
}
