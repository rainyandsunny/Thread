package capter6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ��̬��������Դﵽ�̰߳�ȫ���⣬
 * ������������л�����ʱ��ʹ��Ĭ�ϵķ�ʽ���еõ��Ľ�����Ƕ����ġ�
 * ����취���ڷ����л���ʹ��readResolve()����
 * @author yhp5210
 * 
 */
public class SaveAndRead {

	public static void main(String[] args) {

		try {
			MyObject5 myObject = MyObject5.getInstance();
			FileOutputStream fosRef = new FileOutputStream(new File(
					"myObjectFile.txt"));
			ObjectOutputStream oosRef = new ObjectOutputStream(fosRef);
			oosRef.writeObject(myObject);
			oosRef.close();
			fosRef.close();
			System.out.println(myObject.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fisRef = new FileInputStream(new File(
					"myObjectFile.txt"));
			ObjectInputStream iosRef = new ObjectInputStream(fisRef);
			MyObject5 myObject = (MyObject5) iosRef.readObject();
			iosRef.close();
			fisRef.close();
			System.out.println(myObject.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
