package capter3;

public class Service2 {

	public void testMethod(Object lock) {

		try {
			synchronized (lock) {
				System.out.println("begin wait����");
				lock.wait();
				System.out.println("end wait()");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("�����쳣�ˣ���Ϊ��wait״̬���̱߳�interrupt�ˣ�");
		}
	}
}
