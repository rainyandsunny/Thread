package capter2;

/**
 * 锁可重入的另一种场景：继承（子类完全可以通过“可重入锁”调用父类的同步方法）
 * @author yhp5210
 *
 */
public class Run9 {

	public static void main(String[] args) {

		MyThread1 t = new MyThread1();
		t.start();
	}

}
