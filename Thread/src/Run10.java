
/**
 * stop方法会抛出ThreadDeath异常
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		MyThread11 thread = new MyThread11();
		thread.start();
	}

}
