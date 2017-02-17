package capter6;

public class MyObject4 {

	private static class MyObjectHandler{
		
		private static MyObject4 object = new MyObject4();
	}
	
	private MyObject4(){}
	
	public static MyObject4 getInstance(){
		
		return MyObjectHandler.object;
	}
}
