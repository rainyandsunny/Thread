package capter6;

/**
 * enumʵ�ֵ���ģʽ
 * @author yhp5210
 *
 */
public class MyThread6 extends Thread {

	@Override
	public void run(){
		System.out.println(MyObject7.connectionFactory.hashCode());
	}
}
