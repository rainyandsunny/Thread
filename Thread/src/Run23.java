/**
 * �ػ��߳�ʾ��
 * �������в����ڷ��ػ��̵߳�ʱ���ػ��߳��Զ����١�������Ӧ��GC��
 * @author yhp5210
 *
 */
public class Run23 {

	public static void main(String[] args) {

		try{
			MyThread22 thread = new MyThread22();
			thread.setDaemon(true);
			thread.start();
			Thread.sleep(5000);
			System.out.println("���뿪thread����Ҳ���ٴ�ӡ�ˣ�Ҳ����ֹͣ�ˣ�");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
