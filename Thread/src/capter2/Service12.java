package capter2;

public class Service12 {

	private boolean isContinueRun = true;
	
	public void runMethod(){
		
		String anyString = new String();
		while(isContinueRun){
			synchronized (anyString) {
				
			}
		}
		System.out.println("ͣ�����ˣ�");
	}
	
	public void stopMethod(){
		isContinueRun = false;
	}
	
}
