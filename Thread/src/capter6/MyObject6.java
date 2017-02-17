package capter6;

public class MyObject6 {

	private static MyObject6 instance = null;
	private MyObject6(){
		System.out.println("构造函数");
	}
	
	static{
		System.out.println("静态代码块");
		instance = new MyObject6();
	}
	
	/*{
		System.out.println("代码块");
	}*/
	public static MyObject6 getInstance(){
		return instance;
	}
}
