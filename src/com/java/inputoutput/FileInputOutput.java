package com.java.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;

public class FileInputOutput {
	
	public static void main(String[] args) throws IOException{
		
		// inputsteam object
		// read what is put in
		InputStream inputStream = System.in;
		
		// write out
		OutputStream outputStream = System.out;
			
		// FileInputStream
		// FileOutputStream		
		FileOutputStream fot = new FileOutputStream("test");
		OutputStream ot = new FileOutputStream("test");
		
	//	FileInputStream fit = new FileInputStream("test");
		InputStream it = new FileInputStream("testin");
		
		int i = 0;
		
		// char------->integer
		// char ------->ASCII table: every char has a number to it
		// end of stream : -1
		while((i = it.read()) != -1){	
			
			// write out to screen
	//		System.out.println((char)i);
			
			// it automatically conver int to char, 
			// no need to use (char)i;
		//	outputStream.write(i);
		//	fot.write(i);
		//	ot.write(i);
		//	ot.write(i);
			
		//	System.out.println((char)i);
			
		}	
		
	//	fot.close();
 // ot.close();
		
		// pdf input stream
		// pdf output stream
		// apis
		
		// print stream
		String s = "jjjjjjjssssssbbbbbbffff";
	
		// write method only write int
		// so we can use print stream to write
		
		// PrintStream type as reference to call its method
		// write to a File Output Stream
		PrintStream ps = new PrintStream(fot);
		
		// write s to the file
		ps.println(s);
		
		Reader r = new InputStreamReader(System.in);
		
		// byte
		Writer w = new OutputStreamWriter(System.out);
		
		// char
		Writer wp = new PrintWriter(System.out);
		
		// no need to use FileOutputStream
		// but no method to use, so pass to printwriter to use the methods
		FileWriter fw = new FileWriter("test");
		
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("hello");
		
		r.close();
		w.close();
		wp.close();
		fw.close();
		pw.close();
		
		// inputstream, outputstream: 32bits
		// reader, writer: 64bits
		
	     // serialization
		
	}
	
	
	// input stream:keyboard:	
	// output stream: screen: 

	// stream - binary - 
	// type in - convert
	// char - binary
	// A-1010
	// B-1110
	// C-1101
	// now output: 
	// binary - char

	// byte stream: 0 1 : 32 bits:
	// mostly used
	// InputStream:read: System.in
	// OutputStream:write: System.out
	
	// character stream: 64 bits
	// special, chinese characters
	// Reader
	// Writer

}
