package capter7;

/**
 * �߳����쳣�Ĵ����Զ���ThreadGroupʵ��uncaughtException����
 * @author yhp5210
 *
 */
public class Run10 {

	public static void main(String[] args) {

		MyThreadGroup group = new MyThreadGroup("�ҵ��߳���");
		MyThread8[] myThread = new MyThread8[10];
		for(int i = 0; i < myThread.length; i++){
			myThread[i] = new MyThread8(group,"�߳�" + (i + 1),"1");
			myThread[i].start();
		}
		MyThread8 newT = new MyThread8(group,"�����߳�","a");
		newT.start();
	}

}
