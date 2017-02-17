package capter6;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject5 implements Serializable {

	private static final long serialVersionUID = 888L;

	private static class MyObjectHandler {

		private static final MyObject5 myObject = new MyObject5();

	}

	private MyObject5() {
	}

	public static MyObject5 getInstance() {

		return MyObjectHandler.myObject;
	}


	protected Object readResolve() throws ObjectStreamException {

		System.out.println("调用了readResolve方法！");
		return MyObjectHandler.myObject;
	}

}
