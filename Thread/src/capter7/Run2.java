package capter7;

/**
 * �ȴ�����ͬ��������״̬ΪBLOCKED
 * @author yhp5210
 *
 */
public class Run2 {

	public static void main(String[] args) {
		
		MyThread2 t1 = new MyThread2();
		t1.setName("a");
		t1.start();
		MyThread3 t2 = new MyThread3();
		t2.setName("b");
		t2.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main�����е�t2״̬��" + t2.getState());
	}

}
