package capter2;

/**
 * 虽然能够停止子线程，但是运行在 -server服务器模式中64bit的JVM上时，会出现死循环
 * volatile：强制从公共堆栈中取得变量的值，而不是从线程私有数据栈中取得变量的值，
 * @author yhp5210
 *
 */
public class Run35 {

	public static void main(String[] args) {
		
		PrintString1 printStringService = new PrintString1();
		new Thread(printStringService).start();
		System.out.println("我要停止它！stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
