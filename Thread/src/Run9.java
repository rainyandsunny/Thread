
/**
 * ʹ��stopֹͣ�̣߳���Ȼ����ֹͣ�������Ƽ�������ͨ�����쳣�ķ�ʽ��
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
