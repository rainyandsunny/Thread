package capter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * signal()������ּ���������
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
				System.out.println("�п��ܡ������");

				condition.await();

			}
			System.out.println("��ӡ��");
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
				System.out.println("�п��ܡ������");
				condition.await();
			}
			System.out.println("��ӡ��");
			hasValue = false;
			condition.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
}
