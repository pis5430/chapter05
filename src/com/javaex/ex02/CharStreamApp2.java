package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException  {
		
		//Reader fr = new FileReader("C:\\javaStudy\\song.txt"); //--> utf 파일
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt"); // --> ms949 파일이라서 출력하면 깨짐
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
		
			String str = br.readLine();	 //한줄씩 읽어온다. 줄바꿈기호는 제외	
			if(str == null) { //str값이 없으면 끝
				break;
			}
			System.out.println(str); // 줄바꿈
		
		
		}
		
		
		
		fr.close();
		
		

	}

}
