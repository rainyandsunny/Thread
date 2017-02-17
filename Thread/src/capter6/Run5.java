package capter6;


/**
 * 静态内部类实现单例模式
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args) {

		MyThread4 t1 = new MyThread4();
		MyThread4 t2 = new MyThread4();
		MyThread4 t3 = new MyThread4();
		t1.start();
		t2.start();
		t3.start();
	}

}
