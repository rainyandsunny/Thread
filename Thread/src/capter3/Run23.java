package capter3;

public class Run23 {
	public static ThreadLocal tl = new ThreadLocal<>();
	
	public static void main(String[] args) {

		if(null == tl.get()){
			System.out.println("��δ�Ź�ֵ");
			tl.set("�ҵ�ֵ");
		}
		System.out.println(tl.get());
		System.out.println(tl.get());
		
	}

}
