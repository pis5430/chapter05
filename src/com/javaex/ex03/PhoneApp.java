package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// PhoneDB .txt파일에 있는 정보를 읽어 변수에 담아 출력하세요
		// 리스트 x

		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어오기
			
			if(str == null) { //내용이 없으면 종료
				break;
			}
			
			//배열
			
			String[] tArray = str.split(","); // , 을 기준으로 배열 나누기
			
			System.out.println("이름: " + tArray[0]);
			System.out.println("핸드폰: " + tArray[1]);
			System.out.println("회사: " + tArray[2]);
			System.out.println(""); //줄바꿈

		}
		
		
		
		
		br.close();

	}

}
