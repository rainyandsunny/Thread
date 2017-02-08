package capter2;

/**
 * 在主线程中死循环，不能执行下面的语句
 * @author yhp5210
 *
 */
public class Run34 {

	public static void main(String[] args) {

		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("我要停止它！ stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
