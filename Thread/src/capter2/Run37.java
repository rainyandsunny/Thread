package capter2;

/**
 * �ؼ���volatile��Ȼ������ʵ�������ڶ���߳�֮��Ŀɼ��ԣ�����ȴ���߱�ͬ���ԡ�
 * @author yhp5210
 *
 */
public class Run37 {

	public static void main(String[] args) {

		MyThread2[] myThreadArray = new MyThread2[100];
		for(int i = 0; i < 100; i++){
			myThreadArray[i] = new MyThread2();
		}
		
		for(int i = 0; i < 100; i++){
			myThreadArray[i].start();
		}
	}

}
