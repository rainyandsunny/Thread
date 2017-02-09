package capter3;

/**
 * 两个线程都在等待
 * @author yhp5210
 *
 */
public class Run5 {

	public static void main(String[] args){
		
		Object lock = new Object();
		ThreadA2 a = new ThreadA2(lock);
		a.start();
		ThreadB2 b = new ThreadB2(lock);
		b.start();
	}
}
