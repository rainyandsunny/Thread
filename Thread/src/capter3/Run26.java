package capter3;

/**
 * InheritableThreadLocal����������̴߳Ӹ��߳���ȡ��ֵ
 * @author yhp5210
 *
 */
public class Run26 {

	public static void main(String[] args) {

		try{
			for(int i = 0; i < 2; i++){
				System.out.println("��Main�߳���ȡֵ=" + Tools1.tl.get());
				Thread.sleep(100);
			}
			Thread.sleep(5000);
			ThreadA11 a = new ThreadA11();
			a.start();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
