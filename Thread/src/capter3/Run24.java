package capter3;

/**
 * ThreadLocal”√∑®
 * @author yhp5210
 *
 */
public class Run24 {

	public static void main(String[] args) {
		
		try{
			ThreadA10 a = new ThreadA10();
			ThreadB7 b = new ThreadB7();
			a.start();
			b.start();
			for(int i = 0; i < 100; i++){
				Tools.tl.set("Main" + (i + 1));
				System.out.println("Main get Value=" + Tools.tl.get());
				Thread.sleep(2000);
			}
		}catch(InterruptedException e){
			
		}
	}

}
