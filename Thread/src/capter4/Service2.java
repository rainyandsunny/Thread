package capter4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * getQueueLength()�������Ƿ������ȴ���ȡ���������̹߳�����
 * @author yhp5210
 *
 */
public class Service2 {

	public ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1(){
		try{
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "���뷽����");
			Thread.sleep(Integer.MAX_VALUE);
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
