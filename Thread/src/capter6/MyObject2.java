package capter6;

public class MyObject2 {

	private static MyObject2 myObject;
	
	private MyObject2(){}
	
	synchronized public static MyObject2 getInstance(){
		
		try{
			if(myObject != null){
				
			}else{
				Thread.sleep(3000);
				myObject = new MyObject2();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return myObject;
	}
}
