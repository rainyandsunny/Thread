
/**
 * ���Ե�ǰ�߳��Ƿ��Ѿ����ж�״̬��֮�����н���״̬��־�����Ϊfalse�Ĺ���
 * interrupted������ʹ��
 * @author yhp5210
 *
 */
public class Run2 {

	public static void main(String[] args) {

		Thread.currentThread().interrupt();
		System.out.println("�Ƿ�ֹͣ1�� ="+Thread.interrupted());
		System.out.println("�Ƿ�ֹͣ2�� ="+Thread.interrupted());
		System.out.println("end!");
	}

}
