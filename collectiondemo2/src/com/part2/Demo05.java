package com.part2;
/**
 * Ë«ÏòÁ´±í
 * @author Administrator
 *
 */
public class Demo05 {
	
	static class Node
	{
		Node pre;
		Object data;
		Node next;
		
		public Node() {}
		public Node(Node pre,Object data,Node next) {
			this.pre=pre;
			this.data=data;
			this.next=next;
		}
	}
	
	

	public static void main(String[] args)
	{
		 Node n1=new Node(null,"lisi",null);
		 Node n2=new Node(n1,"wagnwu",null);
		 Node n3=new Node(n2,"lisa",n1);
		 
		 
		 n2.next=n3;
		 
		 n1.next=n2;
		 n1.pre=n3;
		 
		 

	}

}
