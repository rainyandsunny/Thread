package capter6;

/**
 * enum实现单例模式
 * @author yhp5210
 *
 */
public class MyThread6 extends Thread {

	@Override
	public void run(){
		System.out.println(MyObject7.connectionFactory.hashCode());
	}
}
