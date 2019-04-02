package com.part7;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 国际化   i18n 
 * 本地化  l10n
 * 
 * 我们写一个程序，美国人看到是英文的界面，中国人看到是中文的界面
 * 国际化的程序，显示本地信息的特征
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
		
		re=MessageFormat.format(re, new String[] {"中中","国国"});
		
		System.out.println(re);
		
	}

}
