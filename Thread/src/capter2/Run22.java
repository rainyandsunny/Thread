package capter2;

public class Run22 {

	public static void main(String[] args) {

		Service7 service1 = new Service7();
		Service7 service2 = new Service7();
		ThreadA19 a = new ThreadA19(service1);
		a.setName("A");
		a.start();
		ThreadB19 b = new ThreadB19(service2);
		b.setName("B");
		b.start();
	}

}
