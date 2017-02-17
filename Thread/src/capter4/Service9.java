package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service9 {

	private ReentrantLock lock = new ReentrantLock();
	
	private Condition condition = lock.newCondition();
	
	public void testMethod(){
		
		try{
			lock.lock();
			System.out.println("wait begin");
			//condition.await(); �߳��ڵȴ���ʱ��interrupt�������쳣
			condition.awaitUninterruptibly();//��������쳣
			System.out.println("wait   end");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("catch");
		}finally{
			lock.unlock();
		}
	}
}
