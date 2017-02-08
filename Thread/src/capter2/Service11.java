package capter2;

public class Service11 {

	public void serviceMethodA(UserInfo userInfo) {

		synchronized (userInfo) {

			try {

				System.out.println(Thread.currentThread().getName());
				userInfo.setUserName("abcabc");
				Thread.sleep(3000);
				System.out.println("end! time= " + System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
