package com.java.assignsold;

public class JSP {

	// JSP
	// jsp implicit objects: use them directly:
	// out.
	// request.
	// response.
	// application.

	// scriptlet: write any java code that is in service method,
	// not everything elsewhere: <% %>

	// what if we want to write method or variables like inside Servlet class,
	// not everything else where
	// declaration: <%! %>

	// import java.util.Date;
	// directive: <%@ %>

	// jsp expression tag:
	// all output:
	// instead of using out.println("");
	// <%= %>
	// <%@taglib %>

	// user request jsp, jsp converted to java servlet file, compile, create object
	// this single object will server multiple
	// user requests: user threads

	// thread:inside one process:
	// process: one app

	// server: create threads: subset of a process
	// execute under process
	// share process memory space

	// process
	// user request
	// create one object
	// how servelt works?

	// threads are used to handle each user request

	// instead of multiple processess: which take
	// too much memroy and slow

	// threads is better

	// servlet life cycle:init, service, destroy

	// servlet interface

	// Generic Servlet class: implements all : FTP; HTTP; ...

	// HttpServlet class
	// Http protocol:
	// Https:
	// hypter t: standard:
	
	/**
	 * The Hypertext Transfer Protocol (HTTP) is an application protocol for
	 * distributed, collaborative, and hypermedia information systems. HTTP is
	 * the foundation of data communication for the World Wide Web. Hypertext is
	 * structured text that uses logical links (hyperlinks) between nodes
	 * containing text.
	 */

	// winscp, filezilla,
	// use FTP: use GenericServlet
	// mostly we use HttpServlet only

	// servelt before java
	// thats why init exists before java constructor

	// constructor used to create class object

	// no constructor: no able to create object
	// how to pass info?

	// they use init() method

	// ServletConfig interface: for one servlet

	/**
	 * <init-param> <param-name>proName</param-name>
	 * <param-value>Maven</param-value> </init-param>
	 */

	// ServletContext: for all servlets globally
	/**
	 * <context-param> <param-name>proName</param-name>
	 * <param-value>Maven</param-value> </context-param>
	 */

	// multiple servlets
	// multiple servlet config

	// but only one servlet context
	
	// session
	
	//user request: LoginServlet object created
	// service method got called
	
	// user request: goes to same LoginServlet object
	// service method got called again
	
	// single LoginServlet handles all requests
	
	// generate html code from servlet
	
	// jsp
	
	// users -- servers -- processes

		// CGI: TOO many processes too slow

		// java with threads in one process
		// is much better

		// app runs on port:

		// apache tomcat; glassfish; jboss;jett;

		// folder structure for web app:
		// project name
		// html, jsp, Vm, : files
		// web-inf: lib: jars
		// web-inf: classes: java class packages
		// web-inf: web.xml: configuration: deployment description

		// different in eclipse
		// but if you run it
		// eclipse will change it
		// to web app folder structure

		// www.sohu.com?2=3 request-->server run some code to take the values
		// -->

		// DWP
		// Maven
		// both use differnt structures

		// servlet: java file: block of java code: small java program:
		// java script
		// user validation
		// html, css

}
