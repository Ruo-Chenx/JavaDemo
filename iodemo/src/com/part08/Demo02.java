package com.part08;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * public class RandomAccessFile  extends Object  implements DataOutput, DataInput
 *  可以读写基本类型 
 *  获取文件中的指针:getFilePointer()
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
