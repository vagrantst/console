package com.hybrid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CommonsLogTest {

	static Log log = LogFactory.getLog(CommonsLogTest.class);
		
	public static void main(String []args){
		String url = 
				"http://ws.bus.go.kr/api/rest/busRouteInfo/"
				+ "getBusRouteList?strSrch="
				+ "6628&ServiceKey="
				+ "AaxqTg02PVW%2BZhaIkh4fVAIiknK6EU6ZkfT1lQEHEo2PRlldpzfhjoBwE63YKQGpiY4JdZCjCktTW2yatRX%2FgA%3D%3D";
		
		try {
			URL u = new URL(url);
			
	/*	InputStream in =u.openStream();
		Reader r = new InputStreamReader(in);
		BufferedReader reader = new BufferedReader(r);*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(u.openStream()));
		
		String line = null;
		while((line =reader.readLine()) !=null){
			log.info(line);
		}
			reader.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {		//네트워크 중간에 끊어 지면 이거 뜸)
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void test1(){
		
			log.info("Hello Commons Logging");
		for(int i =0; i<10; i++){
			log.info("i = " +i);
		}
		
	}

}
//컴파일이 안될 경우  위창의 project- clean 클릭