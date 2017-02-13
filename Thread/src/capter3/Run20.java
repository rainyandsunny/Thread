package capter3;

/**
 * 说明sleep(long)不释放锁
 * @author yhp5210
 *
 */
public class Run20 {

	public static void main(String[] args) {

		try{
			
			ThreadB5 b = new ThreadB5();
			ThreadA7 a = new ThreadA7(b);
			a.start();
			Thread.sleep(1000);
			ThreadC4 c = new ThreadC4(b);
			c.start();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
