package capter4;

/**
 * ��ƽ��ʾ�����������ʱ���������߳�������˳��һ��
 * @author yhp5210
 *
 */
public class Run9 {

	public static void main(String[] args) {

		final Service service = new Service(true);
		Runnable runnable = new Runnable(){
			
			@Override
			public void run(){
				System.out.println(" ���߳�" + Thread.currentThread().getName()
						+ "������ ");
				service.serviceMethod();
			}
		};
		Thread[] threadArray = new Thread[10];
		for(int i = 0; i < 10; i++){
			threadArray[i] = new Thread(runnable);
		}
		for(int i = 0; i < 10; i++){
			threadArray[i].start();
		}
	}

}
