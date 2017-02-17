package capter3;

/**
 * InheritableThreadLocal类可以让子线程从父线程中取得值
 * @author yhp5210
 *
 */
public class Run26 {

	public static void main(String[] args) {

		try{
			for(int i = 0; i < 2; i++){
				System.out.println("在Main线程中取值=" + Tools1.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA11 a = new ThreadA11();
			a.start();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
