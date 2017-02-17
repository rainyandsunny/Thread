package capter7;

import java.lang.Thread.UncaughtExceptionHandler;

/**
 * setDefaultUncaughtExceptionHandler是为本线程所有对象设置默认异常处理
 * @author yhp5210
 *
 */
public class Run8 {

	public static void main(String[] args) {

		MyThread6.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {

				System.out.println("线程：" + t.getName() + "出现了异常");
				e.printStackTrace();
			}
		});
		MyThread6 t1 = new MyThread6();
		t1.setName("线程t1");
		t1.start();
		MyThread6 t2 = new MyThread6();
		t2.setName("线程t2");
		t2.start();
		
	}

}
