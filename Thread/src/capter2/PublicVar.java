package capter2;

public class PublicVar {

	public String userName = "A";
	public String password = "AA";

	synchronized public void setValue(String username, String password) {

		try {
			this.userName = username;
			Thread.sleep(5000);
			this.password = password;
			System.out.println("setValue method thread name="
					+ Thread.currentThread().getName() + " username="
					+ username + " password=" + password);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void getValue() {
		System.out.println("getValue method thread name="
				+ Thread.currentThread().getName() + " username=" + userName
				+ " password=" + password);
	}
}
