package com.part07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo10 {

	public static void main(String[] args) throws IOException
	{
		
		InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(is);

		String str=null;
		while(null!=(str=br.readLine()))
		{
			if("exit".equals(str))System.exit(0);
			System.out.println(str);
		}
		
		System.out.println("^-^");
	}

}
