
/**
 * isInterrupted���÷�
 * �����߳�Thread�����Ƿ��Ѿ����ж�״̬���������״̬��־
 * 
 *
 * @author yhp5210
 *
 */
public class Run3 {

	public static void main(String[] args) {

		try {
			MyThread2 thread = new MyThread2();
			thread.start();
			Thread.sleep(1000);
			thread.interrupt();
			System.out.println("�Ƿ�ֹͣ1��="+thread.isInterrupted());
			System.out.println("�Ƿ�ֹͣ2��="+thread.isInterrupted());
		} catch (InterruptedException e) {
			System.out.println("main catch");
			e.printStackTrace();
		}
		
		System.out.println("end!");
	}

}
