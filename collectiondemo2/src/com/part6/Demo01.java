package com.part6;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.Map  ��һ��key:value�����ݽṹ
 * @author Administrator
 *
 */
public class Demo01 {
	
	static class Entry
	{
		Object key;
		Object value;
		public Entry(Object key,Object value) {this.key=key;this.value=value;}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "<<"+key+":"+value+">>";
		};

	}

	public static void main(String[] args) {

    List<Entry> list=new ArrayList<Entry>();
    list.add(new Entry("mp3","����"));
    list.add(new Entry("mp4","��ͼ"));
    list.add(new Entry("mp5","3D"));
    
    
    for(Entry en:list)
    	System.out.println(en);
    
	}

}
