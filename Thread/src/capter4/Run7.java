package capter4;

/**
 * 生产者消费者（一对一）
 * @author yhp5210
 *
 */
public class Run7 {

	public static void main(String[] args) {

		MyService7 myService = new MyService7();
		MyThreadA a = new MyThreadA(myService);
		a.start();
		MyThreadB b = new MyThreadB(myService);
		b.start();
	}

}
