package com.part05;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * DateInput��Dataoutput�ӿڷ�װ�Ի����������Ͷ�д�ķ���
 * public class DataInputStream extends FilterInputStream implements DataInput
 * public class DataOutputStream extends FilterOutputStream implements DataOutput
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args)throws Exception
	{
		FileOutputStream fo=new FileOutputStream("c:\\iodemo.txt");
        DataOutputStream doos=new DataOutputStream(fo);
        doos.writeInt(32);
        doos.writeBoolean(false);
        doos.writeDouble(34.56);
        doos.writeUTF("��Һ�");
        
        doos.close();
        System.out.println("OK");
        
	}

}
