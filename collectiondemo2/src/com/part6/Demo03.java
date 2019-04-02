package com.part6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * Map的 key不能重复，Map的所有key也是一个Set
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("mp3", "章节");
		map.put(23,new Object());
		map.put(false, "goto");
		map.put("mp3","音东");
		
		
		//所有key的集合，
		/*Set  keys=map.keySet();
		Iterator it=keys.iterator();
		while(it.hasNext())
		{
			Object key=it.next();
			Object value=map.get(key);
			
			System.out.println(key+"::"+value);
		}*/
	
		//Map中放的是一个一个的entry
		Set set=map.entrySet();
		for(Object o:set)
		{
			Map.Entry en=(Map.Entry)o;
			System.out.println(en.getKey()+"-->"+en.getValue());
			
		}

	}

}
