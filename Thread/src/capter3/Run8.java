package capter3;

/**
 * ����̵߳ȴ���Ȼ�����notify,����ֻ����һ��
 * @author yhp5210
 *
 */
public class Run8 {

	public static void main(String[] args) {

		Object lock = new Object();
		ThreadA5 a = new ThreadA5(lock);
		a.start();
		ThreadB3 b = new ThreadB3(lock);
		b.start();
		ThreadC c = new ThreadC(lock);
		c.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ֻ����һ�Σ�����ֻ��һ���̱߳�����
		/*NotifyThread1 notifyThread = new NotifyThread1(lock);
		notifyThread.start();*/
		
		//��ε���notify����ȫ������
		NotifyThread2 notifyThread = new NotifyThread2(lock);
		notifyThread.start();
	}

}
