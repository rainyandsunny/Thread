package capter6;

/**
 * ͬ�������������ģʽ�̰߳�ȫ���⣨����Ҳ�ܽ�����⣬����Ч�ʲ��ߣ������DCL��double check lock����ͬ����Ҫ���룩
 * @author yhp5210
 *
 */
public class Run4 {

	public static void main(String[] args) {

		MyThread3 t1 = new MyThread3();
		MyThread3 t2 = new MyThread3();
		MyThread3 t3 = new MyThread3();
		t1.start();
		t2.start();
		t3.start();
	}

}
