package capter3;

public class BackupB extends Thread {

	private DBTools dbtools;
	
	public BackupB(DBTools dbtools){
		super();
		this.dbtools = dbtools;
	}
	
	@Override
	public void run(){
		dbtools.backupB();
	}
}
