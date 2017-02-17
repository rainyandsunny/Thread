package capter6;

public class MyObject3 {

	private static MyObject3 myObject;
	
	private MyObject3(){}
	
	public static MyObject3 getInstance(){
		
		try{
			synchronized (MyObject.class) {
				if(myObject != null){
					
				}else{
					Thread.sleep(3000);
					myObject = new MyObject3();
				}
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return myObject;
	}
}
