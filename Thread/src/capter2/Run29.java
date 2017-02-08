package capter2;

import capter2.OutClass.Inner;

/**
 * ���ڳ��е�����ͬ�����Խ�����������
 * 
 * @author yhp5210
 * 
 */
public class Run29 {

	public static void main(String[] args) {

		final Inner inner = new Inner();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner.method1();
			}
		}, "A");
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				inner.method2();
			}
		}, "B");
		t1.start();
		t2.start();
	}

}
