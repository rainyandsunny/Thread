package capter2;

/**
 * 多个线程同时执行synchronized(X){}同步代码块时呈同步效果
 * @author yhp5210
 *
 */
public class Run17 {

	public static void main(String[] args) {
		
		Service4 service = new Service4();
		MyObject object = new MyObject();
		ThreadA15 a = new ThreadA15(service, object);
		a.setName("a");
		a.start();
		ThreadB15 b = new ThreadB15(service,object);
		b.setName("b");
		b.start();
		
	}

}
