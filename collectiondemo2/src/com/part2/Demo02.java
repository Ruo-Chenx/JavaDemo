package com.part2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * java.util.List��Collection���ӽӿڣ����ڹ���һ������������ķ�ʽ����
 * ListIterator��Iteratoer���ӽӿڣ����Զ��ǰ����ǰ����  ����û��
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {

     List  list=new ArrayList();
     
     list.add("lisi");
     list.add("zhangan");
     list.add(0,"lisa");
     list.add("jack");
     list.add("rose");
     
     for(Object obj:list)
     {
    	 System.out.println(obj);
     }
     System.out.println("------------------------------------");
     ListIterator li=list.listIterator(3);
     while(li.hasPrevious())
     {
    	 System.out.println(li.previous()+"***"+li.previousIndex());
     }
 

	}

}
