package capter3;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * ͨ���ܵ������̼߳�ͨ�ţ��ֽ���
 * @author yhp5210
 *
 */
public class Run14 {

	public static void main(String[] args) {

		try{
			WriteData writeData = new WriteData();
			ReadData readData = new ReadData();
			PipedInputStream inputStream = new PipedInputStream();
			PipedOutputStream outputStream = new PipedOutputStream();
			inputStream.connect(outputStream);
			ThreadRead threadRead = new ThreadRead(readData,inputStream);
			threadRead.start();
			Thread.sleep(2000);
			ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
			threadWrite.start();
		}catch(Exception e){
			
		}
	}
}
