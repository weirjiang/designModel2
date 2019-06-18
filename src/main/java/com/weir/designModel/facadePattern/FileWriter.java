package com.weir.designModel.facadePattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;


public class FileWriter {
	public void Write(String encryptStr, String fileNameDes) {
		System.out.println("保存密文，写入文件");
		FileOutputStream fos = null;
		ClassLoader classLoader = FileWriter.class.getClassLoader();
		URL resource = classLoader.getResource(fileNameDes);  
	    String path = resource.getPath();  
		File file = new File(path);
		if(!file.exists()){
			try {
				file.createNewFile();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			fos = new FileOutputStream(file);
			byte[] str = encryptStr.getBytes();
			fos.write(str);
			fos.flush();
			fos.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
