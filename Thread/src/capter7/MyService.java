package capter7;

public class MyService {

	synchronized static public void serviceMethod(){
		
		try{
			System.out.println(Thread.currentThread().getName() + "������ҵ�񷽷���");
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
