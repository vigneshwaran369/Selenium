package com.selenium;

import java.io.File;
import java.util.Iterator;

public class PExtra2_FindMyFileInMyLap {
	
	public static void main(String[] args) {
		
		
		File f = new File("C:\\Users\\LENOVO\\Downloads");
		File[] listFiles = f.listFiles();
		for(File i : listFiles) {
			System.out.println(i.getName());
			if(i.getName().equals("on FIRIDAY.mp4")) {
				System.out.println("file found");
			}
		}
		for(File i : listFiles) {
			if(i.getName().equals("on FIRIDAY.mp4")) {
				System.out.println(i.getName().toUpperCase());
			}
	}
	
}
}