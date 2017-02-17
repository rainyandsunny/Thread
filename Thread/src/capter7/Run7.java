package capter7;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * setUncaughtExceptionHandler�÷�
 * @author yhp5210
 *
 */
public class Run7 {

	public static void main(String[] args) {

		MyThread6 t1 = new MyThread6();
		t1.setName("�߳�t1");
		t1.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {

				System.out.println("�̣߳�" + t.getName() + "�������쳣");
				e.printStackTrace();
			}
		});
		t1.start();
		MyThread6 t2 = new MyThread6();
		t2.setName("�߳�t2");
		t2.start();
	}

}
