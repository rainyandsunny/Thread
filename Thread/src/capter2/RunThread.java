package capter2;

public class RunThread extends Thread {

	private volatile boolean isRunning = true;

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	@Override
	public void run(){
		System.out.println("����run��");
		while(isRunning){
			
		}
		System.out.println("�̱߳�ֹͣ��");
	}
	
}
