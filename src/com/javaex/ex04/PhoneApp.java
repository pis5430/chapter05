package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		//바이트 기반 스트림 --> 문자 기반 스트림
		//InputStream, OutputStream --> Readeer , Writer
	
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr); //버퍼를 이용한 입출력 성능향상 ,문자기반 보조스트림
		
		ArrayList<Person> pList = new ArrayList<Person>();
		
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] tArray = str.split(","); // ,을 기준으로 배열 나누기
			
			Person p01 = new Person(tArray[0],tArray[1],tArray[2]); // name,hp,company
			
			pList.add(p01); // List활용 --> 기존 내용을 리스트에 추가
		}
		
		/*
		for(int i = 0; i<pList.size(); i++) { //기존 정보 출력
			pList.get(i).showInfo();
		}
		*/
		
		//////////////////////////////////////
		//데이터 추가 및 새로운 파일 생성
		
		Writer fw = new FileWriter("C:\\javaStudy\\NEW_PhoneDB.txt"); //
		BufferedWriter bw = new BufferedWriter(fw);
		
		Person nPer = new Person("표이슬","11-1111-1111","11-111-1111");
		pList.add(nPer); //데이터 추가 --> 추가할 내용을 리스트에 추가
		
		//리스트 - 총 4개의 데이터 (실행시킬때마다 추가)
		// 전체를 다 다시쓴다.(for문? / 새로운 txt파일?)
		
		for(int i=0; i<pList.size(); i++) { //추가한 내용까지 새로운 파일에 한꺼번에 출력
			bw.write(pList.get(i).getName()+ "," +pList.get(i).getHp()+ "," +pList.get(i).getCompany());
			bw.newLine();
			pList.get(i).showInfo();
		}
		
		br.close();
		bw.close();
		

	}

}
