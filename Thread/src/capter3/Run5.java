package capter3;

/**
 * �����̶߳��ڵȴ�
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
