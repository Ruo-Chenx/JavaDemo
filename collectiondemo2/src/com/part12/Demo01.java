package com.part12;
/**
 * ö��   
 * @author Administrator
 *
 */
public class Demo01
{
	
	
	public static void main(String[] args) 
	{
		Sex s1=Sex.MALE;
		Sex s2=Sex.FEMALE;
		
		
		System.out.println(s1+"---"+s1.ordinal());
		System.out.println(s2.getSex()+"---"+s2.ordinal());
		
		//����������ͬ
		Sex s3=Enum.valueOf(Sex.class, "FEMALE");
		Sex s33=Sex.FEMALE;
		
		System.out.println(s3+"---"+s33);
		
	}

}
