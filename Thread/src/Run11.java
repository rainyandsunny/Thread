
/**
 * 强行stop会导致数据不一致
 * @author yhp5210
 *
 */
public class Run11 {

	public static void main(String[] args) {

		try{
			SynchronizedObject object = new SynchronizedObject();
			MyThread12 thread = new MyThread12(object);
			thread.start();
			Thread.sleep(500);
			thread.stop();
			System.out.println(object.getUsername() + " "
					+ object.getPassword());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
