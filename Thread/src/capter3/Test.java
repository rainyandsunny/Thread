package capter3;

/**
 * ��sleep�ķ���ģ��ȴ�ĳһ���߳�ִ�н���
 * @author yhp5210
 *
 */
public class Test {

	public static void main(String[] args) {

		MyThread threadTest = new MyThread();
		threadTest.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���뵱threadTest����ִ����Ϻ���ִ��");
		System.out.println("����������е�sleep()�е�ֵӦ��д����");
		System.out.println("���ǣ����ݲ���ȷ��");
	}

}
