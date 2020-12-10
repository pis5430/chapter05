package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		ArrayList<Person> pList = new ArrayList<Person>();
		
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] tArray = str.split(","); // ,을 기준으로 배열 나누기
			
			Person p01 = new Person(tArray[0],tArray[1],tArray[2]); // name,hp,company
			
			pList.add(p01); // List활용
		}
		
		for(int i = 0; i<pList.size(); i++) { //기존 정보 출력
			pList.get(i).showInfo();
		}
		
		//////////////////////////////////////
		//데이터 추가 및 새로운 파일 생성
		
		
		
		
		
		
		
		
		
		
		br.close();
		

	}

}
