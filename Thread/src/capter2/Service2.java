package capter2;

public class Service2 {

	private String usernameParam;
	private String passwordParam;
	private String anyString = new String();
	
	public void setUsernamePassword(String username,String password){
		
		try{
			synchronized (anyString) {
				System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
						+"��" + System.currentTimeMillis() + "����ͬ����");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println("�߳�����Ϊ��"+Thread.currentThread().getName()
						+"��" + System.currentTimeMillis() + "�뿪ͬ����");
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
