package capter4;

/**
 * lock.isFair()�ж��ǲ��ǹ�ƽ��
 * @author yhp5210
 *
 */
public class Run16 {

	public static void main(String[] args) {

		final Service6 service1 = new Service6(true);
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
