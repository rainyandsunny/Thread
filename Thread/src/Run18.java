
/**
 * ��ͬ���ȼ����߳����н�������ȼ��ߵĲ���һ�������ȼ��͵���������
 * @author yhp5210
 *
 */
public class Run18 {

	public static void main(String[] args) {
		
		for(int i = 0;i < 5; i++){
			MyThread18 thread1 = new MyThread18();
			thread1.setPriority(10);
			thread1.start();
			MyThread19 thread2 = new MyThread19();
			thread2.setPriority(1);
			thread2.start();
		}
	}

}
