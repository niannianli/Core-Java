package com.java.accessin;

public class RuninDemo {

	// this method alreayd used by other classess/code
	// should not change this?
	// still we can changes in other ways
	public void add() {

	}

	public static void main(String[] args) {

		// only human
		Human h = new Human();
		System.out.println(h.name);
		System.out.println(h.age);

		// only student
		Student s = new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.rollNo);

		// teacher the same

		Human sh = new Student();
		System.out.println(sh.name);
		System.out.println(sh.age);

		// only human, unless overrided then student
		// System.out.println(sh.rollNo);

		// inheritance
		// simple inheritance: Human-Student
		// hierachical inheritance: Human-Student, Teacher
		// multilevel inheritance: Human-Student-Colleage Student
		// not in java: multiple iheritance: Human, Animal, LivingOrganim:
		// Student
		// hybrid inheritance: Human-Student, Teacher-same class
	}

}

// parent class
class Human {

	String name;
	int age;

}

// child class inhertances the name and age
class Student extends Human {
	int rollNo;

}

class Teacher extends Human {
	int empNo;
}

// mvnrepository

// extends can be used once, in order to achieve multiple inheritance,
// we can implements Interface

class CollegeStudent extends Student {

}