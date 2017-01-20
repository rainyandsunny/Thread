
/**
 * 高优先级的线程运行得快
 * @author yhp5210
 *
 */
public class Run20 {

	public static void main(String[] args) {

		try{
			ThreadA a = new ThreadA();
			a.setPriority(Thread.NORM_PRIORITY - 3);
			a.start();
			ThreadB b = new ThreadB();
			b.setPriority(Thread.NORM_PRIORITY + 3);
			b.start();
			Thread.sleep(20000);
			a.stop();
			b.stop();
			System.out.println("a="+a.getCount());
			System.out.println("b="+b.getCount());
		}catch(InterruptedException e){
			
		}
	}

}
