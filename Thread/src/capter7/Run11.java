package capter7;

public class Run11 {

	public static void main(String[] args) {

		MyThread9 myThread = new MyThread9();
		//myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
		MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
		myThread.start();
	}

}
