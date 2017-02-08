package capter2;

public class Run39 {

	public static void main(String[] args) {

		try {
			MyService2 service = new MyService2();
			MyThread3[] array = new MyThread3[5];
			for (int i = 0; i < array.length; i++) {
				array[i] = new MyThread3(service);
			}
			for (int i = 0; i < array.length; i++) {
				array[i].start();
			}
			Thread.sleep(1000);
			System.out.println(service.aiRef.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
