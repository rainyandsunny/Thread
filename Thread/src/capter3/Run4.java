package capter3;

/**
 * notify执行后当前线程并不立即释放锁
 * @author yhp5210
 *
 */
public class Run4 {

	public static void main(String[] args) {

		try{
			Object lock = new Object();
			ThreadA1 a = new ThreadA1(lock);
			a.start();
			Thread.sleep(50);
			ThreadB1 b = new ThreadB1(lock);
			b.start();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
