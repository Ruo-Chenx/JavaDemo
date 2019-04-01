package com.part01;

import java.util.ArrayList;
import java.util.List;

/**
 * Annotation ÊÇÒ»ÖÖ×¢ÊÍ
 * @author Administrator
 *
 */
public class Demo01
{
   public static void main(String[] args) {
	Demo01 d1=new Demo01();
	System.out.println(d1);
	
	d1.cc();
   }
  
   @Deprecated
   public void cc()
   {
	   
   }
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
		public String toString() {
			// TODO Auto-generated method stub
		   @SuppressWarnings("unused")
		String str="aaa";
	
		   
		List a=new ArrayList();
	 a.add("abc");
			return "^_^";
		}
   
   
}
