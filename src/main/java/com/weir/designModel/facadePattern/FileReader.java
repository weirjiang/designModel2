package com.weir.designModel.facadePattern;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

public class FileReader {
	public String read(String fileNameSrc){
		System.out.println("读取文件，获取明文！");
		FileInputStream fis = null;
		ClassLoader classLoader = FileReader.class.getClassLoader();
		URL resource = classLoader.getResource(fileNameSrc);  
	    String path = resource.getPath();  
		File file = new File(path);
		StringBuffer sb = new StringBuffer();
		try {
			int data;
			fis = new FileInputStream(file);
			while((data = fis.read())!=-1){
				sb.append(data);
			}
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
		
	}
}
