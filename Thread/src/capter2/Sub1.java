package capter2;

public class Sub1 extends Main1 {

	@Override
	 public void serviceMethod() {

		try {
			System.out.println("int sub ��һ��sleep begin threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int sub ��һ��sleep end threadName="
					+ Thread.currentThread().getName() + " time="
					+ System.currentTimeMillis());
			super.serviceMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
