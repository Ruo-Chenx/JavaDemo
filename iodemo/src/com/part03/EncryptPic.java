package com.part03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EncryptPic {

	public static void main(String[] args) throws Exception 
	{
		    JFileChooser chooser = new JFileChooser();
		    
		    FileNameExtensionFilter filter = new FileNameExtensionFilter(
		        "JPG & GIF Images", "jpg", "gif","xzy");
		    chooser.setFileFilter(filter);
		    
		    int returnVal = chooser.showOpenDialog(null);
		    
		    if(returnVal == JFileChooser.APPROVE_OPTION) {
		    	 encrypt(chooser.getSelectedFile(),true);
		    }

	}
	/**
	 * 对文件加密  aa.jpg    aa_jpg.xzy
	 * @param del是否保留原文件  true不保留
	 * @param path
	 * @throws Exception 
	 */
	public static void encrypt(File path,boolean  del) throws Exception
	{
		FileInputStream fi=new FileInputStream(path);
		String filename=path.getName();
		int lastdot=filename.lastIndexOf(".");
		
		String prename=filename.substring(0,lastdot);
		
		String extname=filename.toLowerCase().substring(lastdot);
		FileOutputStream fo=null;
		File target=null;
		String msg=null;
		if(".xzy".equals(extname))
		{
	       msg="解密";
			// 解密
			target=new File(path.getParent(),prename+"."+prename.substring(prename.length()-3));
			
		}else
		{
			 msg="加密";
			//加密
			target=new File(path.getParent(),prename+"_"+extname.substring(1)+".xzy");
		}
		fo=new FileOutputStream(target);
		
		
		byte[]buffer=new byte[4096];
		int len=-1;
		while((len=fi.read(buffer))>0)
		{
			//加密
			for(int i=0;i<len;i++)
			{
				buffer[i]=(byte)(buffer[i]^13);
			}
			
			fo.write(buffer,0,len);
		}
		fi.close();
		fo.close();
		if(del)path.delete();
		JOptionPane.showMessageDialog(null,msg+"完成");
	}

}
