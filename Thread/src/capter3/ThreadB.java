package capter3;

public class ThreadB extends Thread {

	private MyList list;
	
	public ThreadB(MyList list){
		super(); 
		this.list = list;
	}
	
	@Override
	public void run(){
		try{
			while(true){ 
				if(5 == list.size()){
					System.out.println("==5线程B要退出了");
					throw new InterruptedException();
				}
			}
		}catch(InterruptedException e){
			
		}
	}
}
