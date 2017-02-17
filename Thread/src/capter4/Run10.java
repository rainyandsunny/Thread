package capter4;

/**
 * �ǹ�ƽ��ʾ�������н��������������ģ�˵����start�������̲߳��������Ȼ����
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		final Service service = new Service(false);
		Runnable runable = new Runnable() {

			@Override
			public void run() {
				System.out.println(" ���߳�" + Thread.currentThread().getName()
						+ "������");
				service.serviceMethod();
			}
		};

		Thread[] threadArray = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threadArray[i] = new Thread(runable);
		}
		for (int i = 0; i < 10; i++) {
			threadArray[i].start();
		}
	}
}
