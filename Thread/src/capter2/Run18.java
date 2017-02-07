package capter2;

/**
 * 使用不同的对象监视器，多个线程访问则会造成异步访问
 * @author yhp5210
 *
 */
public class Run18 {

	public static void main(String[] args) {

		Service4 service = new Service4();
		MyObject object1 = new MyObject();
		MyObject object2 = new MyObject();
		ThreadA15 a = new ThreadA15(service, object1);
		a.setName("a");
		a.start();
		ThreadB15 b = new ThreadB15(service,object2);
		b.setName("b");
		b.start();
	}

}
