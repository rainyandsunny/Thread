package capter4;

/**
 * isLocked()�������ǲ�ѯ�������Ƿ��������̱߳���
 * @author yhp5210
 *
 */
public class Run18 {

	public static void main(String[] args) {

		final Service8 service1 = new Service8(true);
		Runnable runnable = new Runnable(){
			@Override
			public void run(){
				service1.serviceMethod();
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}

}
