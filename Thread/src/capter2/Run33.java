package capter2;


/**
 * ������Ϊ���������Ƕ�������Է����仯�����ɻ�ͬ��ִ��
 * @author yhp5210
 *
 */
public class Run33 {

	public static void main(String[] args) {

		Service11 service = new Service11();
		UserInfo userInfo = new UserInfo();
		ThreadA24 a = new ThreadA24(service,userInfo);
		a.setName("a");
		a.start();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ThreadB24 b = new ThreadB24(service,userInfo);
		b.setName("b");
		b.start();
	}

}
