
public class MyThread6 extends Thread{

	@Override
	public void run(){
		super.run();
		for(int i = 0; i < 500000; i++){
			if(this.interrupted()){
				System.out.println("�Ѿ���ֹͣ״̬�ˣ���Ҫ�˳���");
				break;
			}
			System.out.println("i=" + (i + 1));
		}
		System.out.println("�ұ����������˴�����for�ּ������У��̲߳�δֹͣ��");
	}
}
