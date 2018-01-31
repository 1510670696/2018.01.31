package com.neu.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class dsa {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\ccc.txt");
		InputStream is=new FileInputStream(file);
		byte[] b= new byte[(int)file.length()];
		is.read(b);
		System.out.println(new String(b));
	}

}
