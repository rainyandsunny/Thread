package capter3;

/**
 * ֤��notify()ִ�к������ͷ��������ǵȵ�ǰͬ�������ִ������ͷ�
 * @author yhp5210
 *
 */
public class Run6 {

	public static void main(String[] args) {

		Object lock = new Object();
		ThreadA3 a = new ThreadA3(lock);
		a.start();
		NotifyThread notifyThread = new NotifyThread(lock);
		notifyThread.start();
		SynNotifyMethodThread c = new SynNotifyMethodThread(lock);
		c.start();
	}

}
