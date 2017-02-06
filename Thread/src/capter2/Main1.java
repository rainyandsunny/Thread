package capter2;

public class Main1 {

	synchronized public void serviceMethod(){
		try{
			System.out.println("int main 下一步sleep begin threadName="
					+Thread.currentThread().getName() +" time="
					+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("int main 下一步sleep end threadName="
					+Thread.currentThread().getName() + " time="
					+System.currentTimeMillis());
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
