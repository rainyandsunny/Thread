package capter7;

/**
 * sleep��ʱ��״̬ΪTIMED_WAITING
 * @author yhp5210
 *
 */
public class Run1 {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1();
		t.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main�����е�״̬" + t.getState());
	}

}
