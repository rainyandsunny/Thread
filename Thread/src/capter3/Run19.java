package capter3;

/**
 * join(long) 方法的用法：
 * @author yhp5210
 *
 */
public class Run19 {

	public static void main(String[] args) {

		try{
			MyThread3 threadTest = new MyThread3();
			threadTest.start();
			threadTest.join(2000);
			System.out.println("  end timer=" + System.currentTimeMillis());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
