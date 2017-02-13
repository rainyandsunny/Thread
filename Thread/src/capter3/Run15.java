package capter3;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * ͨ���ܵ������̼߳�ͨ�ţ��ַ���
 * @author yhp5210
 *
 */
public class Run15 {

	public static void main(String[] args) {

		try{
			WriteData1 writeData = new WriteData1();
			ReadData1 readData = new ReadData1();
			PipedReader inputStream = new PipedReader();
			PipedWriter outputStream = new PipedWriter();
			inputStream.connect(outputStream);
			ThreadRead1 threadRead = new ThreadRead1(readData, inputStream);
			threadRead.start();
			Thread.sleep(2000);
			ThreadWrite1 threadWrite = new ThreadWrite1(writeData,outputStream);
			threadWrite.start();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
