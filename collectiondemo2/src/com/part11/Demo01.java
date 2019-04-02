package com.part11;
/**
 * Ã¶¾Ù   
 * @author Administrator
 *
 */
public class Demo01
{
	static class Sex
	{
		private Sex() {}
		public static final Sex MALE=new Sex();
		public static final Sex FEMALE=new Sex();
		
	}
	
	
	public static void main(String[] args) 
	{
		Sex s1=Sex.MALE;
		Sex s2=Sex.FEMALE;
		
	}

}
