package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * hasWaiters(Condition condition)
 * 的作用是查询是否有线程正在等待与此锁定有关的condition条件
 * @author yhp5210
 *
 */
public class Service5 {

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
			System.out.println("有没有线程正在等待newCondition？"
					+ lock.hasWaiters(newCondition)
					+ "线程数是多少？" + lock.getWaitQueueLength(newCondition));
			newCondition.signal();
		}finally{
			lock.unlock();
		}
	}
}
