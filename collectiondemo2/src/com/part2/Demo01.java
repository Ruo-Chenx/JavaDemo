package com.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.List��Collection���ӽӿڣ����ڹ���һ������������ķ�ʽ����
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {

     List  list=new ArrayList();
     
     list.add("lisi");
     list.add("zhangan");
     list.add(0,"lisa");
     
     
     list.set(2, "angel");
     list.remove(2);
     for(int i=0;i<list.size();i++)
     {
    	 System.out.println(list.get(i));
     }

	}

}
