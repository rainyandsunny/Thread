package capter2;

public class ThreadA24 extends Thread {

	private Service11 service;
	private UserInfo userInfo;
	
	public ThreadA24(Service11 service,UserInfo userInfo){
		super();
		this.service = service;
		this.userInfo = userInfo;
	}
	
	@Override
	public void run(){
		service.serviceMethodA(userInfo);
	}
}
