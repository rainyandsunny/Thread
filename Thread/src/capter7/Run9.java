package capter7;

/**
 * �߳�����ĳ���̳߳����쳣�������߳�����ִ��
 * @author yhp5210
 *
 */
public class Run9 {

	public static void main(String[] args) {

		ThreadGroup group = new ThreadGroup("�ҵ��߳���");
		MyThread7[] myThread = new MyThread7[10];
		for(int i = 0;i < myThread.length; i++){
			myThread[i] = new MyThread7(group,"�߳�" + (i + 1),"1");
			myThread[i].start();
		}
		MyThread7 newT = new MyThread7(group,"�̱߳���","a");
		newT.start();
	}

}
