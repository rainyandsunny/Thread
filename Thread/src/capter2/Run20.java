package capter2;

/**
 * 静态同步synchronized方法与synchronized(class)代码块
 * @author yhp5210
 *
 */
public class Run20 {

	public static void main(String[] args) {

		ThreadA17 a = new ThreadA17();
		a.setName("A");
		a.start();
		ThreadB17 b = new ThreadB17();
		b.setName("B");
		b.start();
	}

}
