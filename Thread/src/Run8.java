
/**
 * œ»Õ£÷π‘Ÿsleep£∫java.lang.InterruptedException: sleep interrupted
 * @author yhp5210
 *
 */

public class Run8 {

	public static void main(String[] args) {
	
		MyThread9 thread = new MyThread9();
		thread.start();
		thread.interrupt();
		System.out.println("end!");
	}

}
