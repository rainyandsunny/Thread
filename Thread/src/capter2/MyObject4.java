package capter2;

public class MyObject4 {

	synchronized public void speedPrintString() {

		System.out.println("speedPrintString _getLock time="
				+ System.currentTimeMillis() + " run ThreadName="
				+ Thread.currentThread().getName());
		System.out.println("----------");
		System.out.println("speedPrintString releaseLock time="
				+ System.currentTimeMillis() + " run ThreadName="
				+ Thread.currentThread().getName());
	}
}
