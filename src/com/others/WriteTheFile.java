package com.others;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTheFile {
	
	
	public static void usingFileWritter() throws IOException {
		

		String location ="E:\\me.txt";
		String content ="file writter successfully";
		FileWriter f = new FileWriter(location);
		f.write(content);
		f.close();
		
	}
	
	public static void  usingBufferedWritter() throws IOException {
		
		String location = "E:\\me1.txt";
		String content = "hey hi this is vicky."
				+ "doing java program . "
				+ "writting the file in my local disk";
		
	FileWriter f = new FileWriter(location);
	BufferedWriter b = new BufferedWriter(f);
	b.write(content);
	b.close();
		
		
		
		
		
	}

	public static void main(String[] args) throws IOException {
		//usingFileWritter();
		usingBufferedWritter();
	
	
	
	
	}

}
