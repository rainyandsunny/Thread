package capter4;

/**
 * tryLock(long timeout,TimeUnit unit)��������ڸ����ȴ�ʱ����û�б���һ���̱߳��� ���ҵ�ǰ�߳�δ���жϣ����ȡ��������
 * 
 * @author yhp5210
 * 
 */
public class Run21 {

	public static void main(String[] args) {

		final MyService11 service = new MyService11();
		Runnable runnableRef = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName()
						+ "����waitMethodʱ�䣺" + System.currentTimeMillis());
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}

}
