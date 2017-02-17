package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * hasWaiters(Condition condition)
 * �������ǲ�ѯ�Ƿ����߳����ڵȴ���������йص�condition����
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
			System.out.println("��û���߳����ڵȴ�newCondition��"
					+ lock.hasWaiters(newCondition)
					+ "�߳����Ƕ��٣�" + lock.getWaitQueueLength(newCondition));
			newCondition.signal();
		}finally{
			lock.unlock();
		}
	}
}
