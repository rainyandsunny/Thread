package capter4;

/**
 * isHeldByCurrentThread()�������ǲ�ѯ��ǰ�߳��Ƿ񱣳ִ�����
 * @author yhp5210
 *
 */
public class Run17 {

	public static void main(String[] args) {

		final Service7 service1 = new Service7(true);
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
