package capter2;

/**
 * ‘‡∂¡
 * @author yhp5210
 *
 */
public class Run7 {

	public static void main(String[] args) {
		
		try {
			PublicVar publicVarRef = new PublicVar();
			ThreadA7 thread = new ThreadA7(publicVarRef);
			thread.start();
			Thread.sleep(200);
			publicVarRef.getValue();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
