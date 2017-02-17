package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * signal()处理出现假死的现象
 * @author yhp5210
 *
 */
public class MyService8 {

	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;

	public void set() {
		try {
			lock.lock();
			while (hasValue) {
				System.out.println("有可能★★连续");

				condition.await();

			}
			System.out.println("打印★");
			hasValue = true;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public void get() {

		try {
			lock.lock();
			while (!hasValue) {
				System.out.println("有可能☆☆连续");
				condition.await();
			}
			System.out.println("打印☆");
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
