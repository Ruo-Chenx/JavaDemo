package com.part7;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ���ʻ�   i18n 
 * ���ػ�  l10n
 * 
 * ����дһ�����������˿�����Ӣ�ĵĽ��棬�й��˿��������ĵĽ���
 * ���ʻ��ĳ�����ʾ������Ϣ������
 * @author Administrator
 *
 */
public class Demo02 
{
	public static void main(String[] args) {
		Locale l=Locale.getDefault();
		//Locale l1=new Locale("en", "US");
		ResourceBundle res=ResourceBundle.getBundle("com.part7.Demo02", l);
		
		String re=res.getString("s1");
		
		re=MessageFormat.format(re, new String[] {"����","����"});
		
		System.out.println(re);
		
	}

}
