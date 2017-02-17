package capter6;

/**
 * 静态代码块实现单例模式
 * @author yhp5210
 *
 */
public class Run6 {

	public static void main(String[] args) {

		MyThread5 t1 = new MyThread5();
		MyThread5 t2 = new MyThread5();
		MyThread5 t3 = new MyThread5();
		t1.start();
		t2.start();
		t3.start();
	}

}
