package capter4;

/**
 * ���г���ᱨIllegalMonitorStateException��
 * ����취�Ǳ�����condition.await()��������֮ǰ����lock.lock()���ͬ��������
 * @author yhp5210
 *
 */
public class Run2 {

	public static void main(String[] args) {

		MyService2 service = new MyService2();
		ThreadA1 a = new ThreadA1(service);
		a.start();
	}

}
