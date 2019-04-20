package com.xzy;

public class Config 
{
    public static final int WIDTH=800;
    public static final int HEIGHT=650;
    
    public static final int ROWS=15;//��
    public static final int COLS=15;//��
    
    public static final int[][]MAP=new int[ROWS][COLS];
    
    
    public static final int EMPTY=0;
    public static final int BLACK=2;
    public static final int WHITE=3;
    public static final int FOCUS=1;
    
    public static final int CELL=40;//��Ԫ��Ŀ�
    
    public static final int OFFSETX=25;//ƫ��
    public static final int OFFSETY=10;//ƫ��
    
    
    static {
    	MAP[3][3]=FOCUS;
    	MAP[3][13]=FOCUS;
    	MAP[13][3]=FOCUS;
    	MAP[13][13]=FOCUS;
    	MAP[7][8]=FOCUS;
    	
    }
   
}
