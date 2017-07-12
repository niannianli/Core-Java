package com.java.assignsold;

public class SessionFilter {
	
	//session management
	// even expired session,
	// you can go back with old url
	
	//how to avoid this?
	// use filter
	
	// filter resrouce
	// before reach to servlet
	
	//if user validate go to servlet
	// if user not validate go back to user
	
	// multiple filters can be used
	
	// another kind of filter:
	// set timing limit for web access	
	// if after 10 pm, web not avabile
	
	// various urls/pages
	
	//requests coming:
	
	// through filter:login check
	
	// if logged in: registration page
	// if no: login page

	// jstl, spring
	
	// spring
	//interview questions
	
	//octb certificate
	// oracle: questions
	
	// java interview questions brush
	
	//HackerEarth: practice programming
	
	// array: find the repetitive elements and
	//repeat counts
	//?
	//element: counts
	//2:3	
	
	// session

		// User: id name address phoneNo username password: many
		// Role: id roleName: 1
		// Menu: id menuName:

		// mapping-table: many-many

		// Student:
		// 1, change password
		// 2, see upcoming courses
		// 3,

		// one table: Course:
		// id course_name course_no agenda

		// User: id name address flag(S/T/A) : identify
		// role
		// admin, teacher, student

		// user - batch:
		// student - batch: many to many

		// table
		// batch_no batch_name start_date action(register)

		// design/create table
		// small servlet

		// Batch:
		// create_by
		// create_date
		// mod_by
		// mod_date
		// delete_flag(do not delete data,
		// just flag as deleted as record)

		// User:
		// same

		// spring
		
		// session for each user

		// page1 url;
		// page2 url;

		// user1: request1 request2: session1
		// user2: request1 request2: session2
		// user3: request1 request2: session3

		// why session?
		// http : data never saves in server
}
