package capter3;

public class DBTools {
	
	volatile private boolean prevIsA = false;
	synchronized public void backA(){
		
		try{
			while(prevIsA){
				wait();
			}
			for(int i = 0; i < 5; i++){
				System.out.println("11111");
			}
			prevIsA = true;
			notifyAll();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
	synchronized public void backupB(){
		try{
			while(!prevIsA){
				wait();
			}
			for(int i = 0; i < 5; i++){
				System.out.println("22222");
			}
			prevIsA = false;
			notifyAll();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}
