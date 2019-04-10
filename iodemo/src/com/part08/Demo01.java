package com.part08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * java.io.PrintStream   ×Ö½Ú    ²»»º´æ
 * java.io.PrintWriter   ×Ö·û
 * 
 * 
 * 
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException
	{
		PrintStream ps=new PrintStream("F:\\iodemo.txt");
		
        InputStreamReader is=new InputStreamReader(System.in);
		
		BufferedReader br=new BufferedReader(is);

		String str=null;
		while(null!=(str=br.readLine()))
		{
			if("exit".equals(str))
			{
				ps.close();
				br.close();
				System.out.println("^-^");
				System.exit(0);
			}
			ps.println(str);
			System.out.println(str);
		}
		
	}

}
