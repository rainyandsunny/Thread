package capter3;

/**
 * ThreadLocal����Ĭ��ֵ
 * @author yhp5210
 *
 */
public class Run25 {
	public static ThreadLocalExt tl = new ThreadLocalExt();

	public static void main(String[] args) {
		if(null == tl.get()){
			System.out.println("��δ�Ź�ֵ");
			tl.set("�ҵ�ֵ");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
	}

}
