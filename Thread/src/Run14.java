
/**
 * suspend��������ͣ�̣߳�������ռ
 * @author yhp5210
 *
 */
public class Run14 {

	public static void main(String[] args) {

		try {
			final SynchronizedObject1 object = new SynchronizedObject1();
			Thread thread1 = new Thread() {

				@Override
				public void run() {
					object.printString();
				}
			};
			thread1.setName("a");
			thread1.start();
			Thread.sleep(1000);
			Thread thread2 = new Thread(){
				
				@Override
				public void run(){
					System.out.println("thread2������"
							+ "�������벻��printString������"
							+ "ֻ��ӡһ��begin");
					System.out.println("��ΪprintString()������a�߳�����������Զsuspend��ͣ��");
					object.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
