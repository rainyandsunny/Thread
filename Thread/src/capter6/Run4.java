package capter6;

/**
 * 同步代码块解决懒汉模式线程安全问题（这种也能解决问题，但是效率不高，最好用DCL：double check lock仅仅同步重要代码）
 * @author yhp5210
 *
 */
public class Run4 {

	public static void main(String[] args) {

		MyThread3 t1 = new MyThread3();
		MyThread3 t2 = new MyThread3();
		MyThread3 t3 = new MyThread3();
		t1.start();
		t2.start();
		t3.start();
	}

}
