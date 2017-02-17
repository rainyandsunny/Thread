package capter6;

/**
 * 同步方法解决懒汉式线程不安全问题
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		MyThread2 t1 = new MyThread2();
		MyThread2 t2 = new MyThread2();
		MyThread2 t3 = new MyThread2();
		t1.start();
		t2.start();
		t3.start();
	}

}
