package com.part01;

import java.io.File;

public class Demo05 {

	public static void main(String[] args)throws Exception {
		//¸ù·ÖÇø
		File[]roots=File.listRoots();
		for(File f:roots)
		{
			System.out.println(f.getFreeSpace()+"---"+
					f.getTotalSpace()/1024/1024/1024.0+"---"+f.getUsableSpace());
		}

	}

}
