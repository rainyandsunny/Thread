package capter6;

public class MyObject6 {

	private static MyObject6 instance = null;
	private MyObject6(){
		System.out.println("���캯��");
	}
	
	static{
		System.out.println("��̬�����");
		instance = new MyObject6();
	}
	
	/*{
		System.out.println("�����");
	}*/
	public static MyObject6 getInstance(){
		return instance;
	}
}
