package com.java.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Main {

	public static void main(String[] args) throws IOException {
		
	//	InputStream inputStream = System.in;	
		InputStream inputStream = new FileInputStream("demo");
		
		//Reader reader = new FileReader("");	
		Reader reader1 = new InputStreamReader(System.in);
		
		//System: read()
		
		int var = -1;
	
	while ((var = inputStream.read()) != -1) {
			
			System.out.println((char)var);
	}
		
		//System.out.println(inputStream.read());		
		//System.out.println(inputStream.read());	
		// -1 end of stream
			
	    Writer writer1 = new OutputStreamWriter(System.out);
		
		Writer writer = new FileWriter("demo");
		
		writer.write("test");
		
		writer.close();
		
		Reader inputStream1 = new InputStreamReader(System.in);		
		BufferedReader bufferedReader = new BufferedReader(inputStream1);		
		String str = bufferedReader.readLine();		
		System.out.println(str);		
		
	}
}
