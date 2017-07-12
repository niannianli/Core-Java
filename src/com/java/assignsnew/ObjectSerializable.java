package com.java.assignsnew;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectSerializable {

	public static void main(String[] args) throws Exception {

		//write object into file
		FileOutputStream fileOutputStream = new FileOutputStream("demo");
		ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream);

		User user = new User("NianName");
		objectOutputStream1.writeObject(user);

		objectOutputStream1.close();
		fileOutputStream.close();

		//read object from file
		FileInputStream fileInputStream = new FileInputStream("demo");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		User user1 = (User) objectInputStream.readObject();
		System.out.println(user1.name);

		objectInputStream.close();
		fileInputStream.close();
	}

}


class User implements Serializable {

	private static final long serialVersionUID = 1L;

	String name;

	public User(String name) {
		this.name = name;
	}
	
}
