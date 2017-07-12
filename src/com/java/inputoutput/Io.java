package com.java.inputoutput;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class Io {
	
	private static PrintStream printStream;

	public static void main(String[] args) throws IOException{
		
		//Class.staticvariable.method
		System.out.println("Hello");
		MyStream.out.print();
		
		OutputStream out = System.out;
		PrintStream out1 = System.out;

		//out1.println("Hello");
		
		// no this println method
	//	out.println("Hello");
		//only write one by one
		// the parameter should be int, why i 
		// am passing char?
		//because ASII
		// automatically, convert to int
		
		// 16 bits, can be assigned to a large range: 32 bit
		int x = 'D';
		
	//	out.write('D'); //68
		//out.write(69); //69
	//	out.write(70); // 70
	//	out.close();

	//	PrintStream printStream = new PrintStream(out);
	//	printStream.println("hello");
		
		// System.out pointing to console, 
		// then println to console
		
		//OutputStream-FileOutputStream
		
		/**OutputStream outF = new FileOutputStream
				("/Users/lijiao/Desktop/Demo.rtf");
		printStream = new PrintStream(outF);
		printStream.println("test");
		printStream.close();*/
	
		System.out.println("success1..."); 
		try{    
            FileOutputStream fout=new FileOutputStream("/Users/lijiao/Desktop/Demo.docx");    
            String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("success2...");    
           }catch(Exception e){System.out.println(e);}    
	    System.out.println("success3..."); 
     }    
	
}

class MyStream{
	static OutClazz out = new OutClazz();
}

class OutClazz{
	void print(){
		
	}
}

//Stream
// ByteStream: inputStream, outputStream (32 bits)
// CharStream: Reader, Writer(64 bits)(special character/chinese)

// how to generate a pdf document
// inside pdf, print hello word.
//iText



