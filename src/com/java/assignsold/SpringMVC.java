package com.java.assignsold;

public class SpringMVC {
	
}

//Spring core container:

// Spring container: ApplicationContext

//private static Clazz clazz = new Clazz(); then call Clazz.clazz? 
	
// dependence injection

// by defualt, spring aleasys provide siingle project

// if you do need multiple objects

//next week, spring, session factory, clear.

// spring mvc

//create servlet

// user request in url
// -->controller: servlet: DispatcherServlet
//-->model: method1, method2
//-->response: jsp/html: view

// Spring MVC,...,lots of

// struts: controller: filter
// jsf: controller: servlet

// using spring, you do not need
// to define servlets again and again

//object creation, write code
// manually

// now spring takes care of 
// everything

// web.xml
//pom.xml: java servlet/jstl/spring/hibernate/mysql/common-dbcp/

// java script, css, session, management, 

// spring mvc, html, 

// MVC:

// url-->servlet

//request-->controller-->model(java code)

//-->view, generate html/jsp/vm/xml file sent to user

// model: service method()

//request-->controller-->view: this happens too

// controller uses filter/servlet: java class:java class

// Spring MVC:

// controller: servlet class: code in Spring, just config and use:
// you can config in web.xml file or use @WebServlet(name="Servlet")

// java class: servlet class	
// model: service method(): business logic

// view:jsp

//spring bean lifecycle


//request-->servlet-->servich() method-->

//business logic

//DAO: hibernate: jdbc:
// data provide to service()

// service() response to servlet
// servlert generate html code to 
// user

// servlet: no business logic,
// just generate html to user
// JSF/Struts

// Spring framework:

// Hibernate:

// JSF/Struts, Spring, Hibernate
// can all be used together

// Spring: big: lots of modules
// service()

// DAO: hibernate

// EJB: large projects only

// spring mvc

// ApplicationContext
//bean
//dependency injection

// spring + hibernate

// learn spring: reference document: spring framework: 

//IoC container

// how to achieve dependence injection?

// or use constructor

// spring uses setMethod();

// review interview questions	

//05/04
	// Spring
	
	//servlet config: init values
	//servlet context: init values shared by all
	
	//web application connecting to db
	
	// db:
	
	//user: id(pk) name address tele zipcode user_type username password
	//user_type: Student, Admin; S, A
	//created_by created_date modi_by modi_date
	//delete_flag: we never delete data for real
	// just flag that we want to delele data
	
	//class: id(pk) class_no class_date class_topic
	//cre_by cre_date modi_by modi_date delete_falg
	
	// many-many
	
	// third mapping table with pk fk
	
	//user_class_mapping:
	//id(pk) 
	//user_id(fk)
	//class_id(fk)
	
	// logiin:
	// username password submit
	
	// studnet type: 
	//edit student info
	// select class
	
	// admin type: 
	//create meeting
	// report user info
	
	// before login
	//registration page
	//add new user
	
	//Maven project
	// hibernate
	
	// Spring
	// multiple users
	// lots of objects created
	// need management
	// avoid crash, memory leak, slowness
	
	// more spring
	
	// finish project, use hibernate