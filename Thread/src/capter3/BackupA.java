package capter3;

public class BackupA extends Thread {

	private DBTools dbtools;
	
	public BackupA(DBTools dbtools){
		
		super();
		this.dbtools = dbtools;
	}
	
	@Override
	public void run(){
		dbtools.backA();
	}
}
