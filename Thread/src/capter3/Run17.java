package capter3;

/**
 * ����join()��������ʹ�������̶߳���x����ִ��run()�����е�����
 * ��ʹ��ǰ�߳�z���������ڵ��������ȴ��߳�x���ٺ��ټ���ִ���̡߳�
 * @author yhp5210
 *
 */
public class Run17 {

	public static void main(String[] args) {

		try{
			MyThread threadTest = new MyThread();
			threadTest.start();
			threadTest.join();
			System.out.println("���뵱threadTest����ִ����Ϻ�����ִ��");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
