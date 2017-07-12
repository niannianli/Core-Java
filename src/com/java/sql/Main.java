package com.java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	// download: Connector/J: java jar
	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection connection = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/JAVA_392", "root", "love");

			// so will not update one table and failed another table
			// connection statements all executed, then commit
			connection.setAutoCommit(false);

			// Statement st = connection.createStatement();

			// if use prepared statment: difficult for hackers to hack, not
			// collected
			// to db execution
			// PreparedStatement statement = connection.prepareStatement("select
			// * from user where name = ?");

			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO USER(NAME, ADDRESS, USERNAME, PASSWORD) " + "VALUES(?, ?, ?, ?);");

			// only pass value to replace ?
			// starting from 1 2 3 to replace ? ? ?
			statement.setString(1, "JAMES");
			statement.setString(2, "USA");
			statement.setString(3, "JAMESU");
			statement.setString(4, "JAMESP");

			statement.executeUpdate();

			// int var = 10/0;

			PreparedStatement statement2 = connection.prepareStatement("INSERT INTO ADDRESS(ADDRESS) VALUES(?);");

			// only pass value to replace ?
			// starting from 1 2 3 to replace ? ? ?
			statement2.setString(1, "USA");
			// statement2.setInt(2, 5);

			// st.executeUpdate("INSERT INTO USER(NAME, ADDRESS, USERNAME,
			// PASSWORD)
			// VALUES('LILI', 'USE', 'ADD', 'PSSS')");
			// ResultSet re = statement.executeQuery("SELECT * FROM USER");

			// ResultSet re = statement.executeQuery();

			statement2.executeUpdate();

			// while (re.next()) {
			// System.out.println(re.getString("name") + " " +
			// re.getString("username"));
			// }

			connection.commit();
		} catch (Exception e) {
			// undo all the changes, revert back to previous state
			connection.rollback();
		} finally {// always executed: exception happens or not
			connection.close();
		}

		System.out.println("done");
	}

}

// sql: inner join, outter join, trucate, ACID property
// JOIN VERY IMPORTANT, maintain ACID

// why we use PreparedStatement not Statement?

// PreparedStatement: compile 1 time only as query in statement only, execute 3
// times,
// Statement: select query for 3 times: compile & execute 3 times
// query: mysql server compile then execute

// select * from user where name = ?

// ERD
// Entity Relationship Diagram

// one to many:
// user : 1: id name ph
// address : many: id addr country

// table structure:
// foreign key: add user_id as foreign key for address table
// always points to primary key in another table

// one to one
// primary key is the foregin key
// no need to create a new column for foreign key

// many to many
// one user to many addresses
// one address to many users
// create a new table: for M to M Relationship
// matching table it is

// USER_ADDR_MAPPING: 2 FOREIGN keys: user_id, address_id
// to refer to the 2 tables related.

// ACID
// JOIN

// HIBERNATE
// : no need to write connection code very time
// just use configuration file once, thats all.
// inside resource folder in maven

// Factory: multiple cars

// user->factory->produce car
// session factory
// user request to connect db-call session factory-provide session: hibernate
// object
// similar to connection

// single configuration: single session factory: multiple sessions
