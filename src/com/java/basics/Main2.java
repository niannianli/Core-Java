package com.java.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Clazz c = new Clazz();
		System.out.println(Clazz.var);

		// non static: we create a c object, then new Inner
		// calss, then call method
		// Clazz.Inner ci = c.new Inner();
		// ci.callMe();

		// the class is static now, so no need for Clazz
		// object now, we can use driectly to new InnerClass
		// and call method
		Clazz.Inner ci = new Clazz.Inner();
		ci.callMe();

		// pass this object to stream with seriable
		// User user = new User();
		// user.name = "Rabit";

		// put object into stream
		// ObjectOutputStream

		/**
		 * FileOutputStream fileOutputStream = new FileOutputStream("demo");
		 * ObjectOutputStream objectOutputStream = new
		 * ObjectOutputStream(fileOutputStream);
		 * 
		 * objectOutputStream.writeObject(user);
		 * 
		 * objectOutputStream.close(); fileOutputStream.close();
		 */

		FileInputStream fileInputStream = new FileInputStream("demo");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		User user = (User) objectInputStream.readObject();

		System.out.println(user.name);

	}

	// Inner class can be private, and used within Outer class
}

// JDBC
// MySQL
// install MySQL
// JDBC API
/**
 * Java Database Connectivity (JDBC) is an application programming interface
 * (API) for the programming language Java, which defines how a client may
 * access a database.
 * 
 * cd /usr/local/mysql/bin/
 * 
 * ./mysql -u root -p 
 * 
 * CREATE DATABASE JAVA_392; 
 * 
 * SHOW DATABASES;
 * 
 * USE JAVA_392;
 * 
 * CREATE TABLE USER(ID INT PRIMARY KEY AUTO_INCREMENT, NAME VARCHAR(25),
 * ADDRESS VARCHAR(100), USERNAME VARCHAR(50), PASSWORD VARCHAR(50));
 * 
 * DESC USER; 
 * 
 * INSERT INTO USER(NAME, ADDRESS, USERNAME, PASSWORD) VALUES ('LI',
 * 'USE', 'LILI', 'PS'); 
 * 
 * SELECT * FROM USER;
 */
