package capter2;

/**
 * 被synchronized关键字声明的方法一定是排队运行的
 * @author yhp5210
 *
 */
public class Run4 {

	public static void main(String[] args) {

		MyObject1 object = new MyObject1();
		ThreadA4 a = new ThreadA4(object);
		a.setName("A");
		ThreadB4 b = new ThreadB4(object);
		b.setName("B");
		a.start();
		b.start();
	}

}
