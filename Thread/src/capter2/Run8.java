package capter2;

/**
 * 验证锁可重入：自己可以再次获取自己的内部锁
 * @author yhp5210
 *
 */
public class Run8 {

	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();
	}

}
