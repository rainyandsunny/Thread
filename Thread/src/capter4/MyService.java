package capter4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lock���÷�
 * @author yhp5210
 *
 */
public class MyService {

	private Lock lock = new ReentrantLock();
	public void testMethod(){
		lock.lock();
		for(int i = 0; i < 5; i++){
			System.out.println("ThreadName=" + Thread.currentThread().getName()
					+ (" " + (i + 1 )));
		}
		lock.unlock();
	}
}
