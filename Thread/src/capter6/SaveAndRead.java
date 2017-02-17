package capter6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 静态内置类可以达到线程安全问题，
 * 但如果遇到序列化对象时，使用默认的方式运行得到的结果还是多例的。
 * 解决办法：在反序列化中使用readResolve()方法
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
