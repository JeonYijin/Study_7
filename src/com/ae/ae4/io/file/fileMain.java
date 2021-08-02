package com.ae.ae4.io.file;

import java.io.File;

public class fileMain {

	public static void main(String[] args) {
		
		//File file = new File("C:\\test\\Study1.txt");
		
		File file = new File("C:\\test");
		boolean result = file.exists();
		//result = file.isFile();
		result = file.isDirectory();
		System.out.println(result);
		
		
		
		file = new File(file, "Study1.txt");
		
		result = file.exists();
		System.out.println(result);
		
		
		
		
	}

}
