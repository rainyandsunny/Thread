package capter3;

/**
 * wait״̬���̱߳�interrupt�����InterruptedException�쳣
 * @author yhp5210
 *
 */
public class Run7 {

	public static void main(String[] args) {

		try{
			Object lock = new Object();
			ThreadA4 a = new ThreadA4(lock);
			a.start();
			Thread.sleep(5000);
			a.interrupt();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
