
/**
 * 使用stop停止线程：虽然可以停止，但是推荐做法是通过抛异常的方式来
 * @author yhp5210
 *
 */
public class Run9 {

	public static void main(String[] args) {

		try {
			MyThread10 thread = new MyThread10();
			thread.start();
			Thread.sleep(8000);
			thread.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
