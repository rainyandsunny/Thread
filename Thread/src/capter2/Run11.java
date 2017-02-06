package capter2;

/**
 * 同步不具有继承性
 * @author yhp5210
 *
 */
public class Run11 {

	public static void main(String[] args) {

		Sub1 subRef = new Sub1();
		ThreadA9 a = new ThreadA9(subRef);
		a.setName("A");
		a.start();
		ThreadB9 b = new ThreadB9(subRef);
		b.setName("B");
		b.start();
	}

}
