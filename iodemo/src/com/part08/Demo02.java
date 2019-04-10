package com.part08;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * public class RandomAccessFile  extends Object  implements DataOutput, DataInput
 *  ���Զ�д�������� 
 *  ��ȡ�ļ��е�ָ��:getFilePointer()
 * 
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) throws IOException 
	{
		RandomAccessFile rf=new RandomAccessFile("c:\\iodemo.txt", "rw");
		System.out.println("---"+rf.getFilePointer());
		rf.writeInt(30);
		System.out.println("---"+rf.getFilePointer());
		rf.writeDouble(34.5);
		System.out.println("---"+rf.getFilePointer());
		rf.close();

	}

}
