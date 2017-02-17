package capter6;

public class MyObject1 {

	private static MyObject1 myObject;

	private MyObject1() {
	}

	public static MyObject1 getInstance() {

		if (myObject != null) {

		} else {
			myObject = new MyObject1();
		}
		return myObject;
	}

}
