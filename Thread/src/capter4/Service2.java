package capter4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * getQueueLength()的作用是返回正等待获取此锁定的线程估计数
 * @author yhp5210
 *
 */
public class Service2 {

	public ReentrantLock lock = new ReentrantLock();
	
	public void serviceMethod1(){
		try{
			lock.lock();
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ "进入方法！");
			Thread.sleep(Integer.MAX_VALUE);
		}catch(InterruptedException e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
