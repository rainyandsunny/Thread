package capter4;

/**
 * tryLock()�����ڵ���ʱ����δ����һ���̱߳��ֵ�����£��Ż�ȡ��������
 * @author yhp5210
 *
 */
public class Run20 {

	public static void main(String[] args) {

		final MyService10 service = new MyService10();
		
		Runnable runnableRef = new Runnable(){
			
			@Override
			public void run(){
				service.waitMethod();
			}
		};
		Thread threadA = new Thread(runnableRef);
		threadA.setName("A");
		threadA.start();
		Thread threadB = new Thread(runnableRef);
		threadB.setName("B");
		threadB.start();
	}

}
