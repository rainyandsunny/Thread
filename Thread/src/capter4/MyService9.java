package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService9 {

	public ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void waitMethod() {
		try {
			// /lock.lock(); 用lock程序正常结束
			lock.lockInterruptibly(); // 用lockInterruptibly程序会出现InterruptedException异常
			System.out
					.println("lock begin " + Thread.currentThread().getName());
			for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
				String newString = new String();
				Math.random();
			}
			System.out
					.println("lock   end " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			if (lock.isHeldByCurrentThread()) {
				lock.unlock();
			}
		}
	}
}
