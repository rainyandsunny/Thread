package capter2;

public class Run40 {

	public static void main(String[] args) {

		Service12 service = new Service12();
		ThreadA25 a = new ThreadA25(service);
		a.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ThreadB25 b = new ThreadB25(service);
		b.start();
		System.out.println("已经发起停止的命令了！");
	}

}
