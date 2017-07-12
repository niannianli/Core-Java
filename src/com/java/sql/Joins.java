package com.java.sql;

public class Joins {

	public static void main() {

		// loaders in java
		// internal features:
		// no need for developers

		// packages: classes

		// package: used to organize classes
		// by module
		// folder structure

		// private: inside class only

		/**
		 * SELECT Orders.OrderID, Customers.CustomerName FROM Orders INNER JOIN
		 * Customers ON Orders.CustomerID = Customers.CustomerID;
		 * 
		 * SELECT Orders.OrderID, Customers.CustomerName, Shippers.ShipperName
		 * FROM ((Orders INNER JOIN Customers ON Orders.CustomerID =
		 * Customers.CustomerID) INNER JOIN Shippers ON Orders.ShipperID =
		 * Shippers.ShipperID);
		 * 
		 * SELECT Customers.CustomerName, Orders.OrderID FROM Customers LEFT
		 * JOIN Orders ON Customers.CustomerID = Orders.CustomerID ORDER BY
		 * Customers.CustomerName;
		 * 
		 * SELECT Orders.OrderID, Employees.LastName, Employees.FirstName FROM
		 * Orders RIGHT JOIN Employees ON Orders.EmployeeID =
		 * Employees.EmployeeID ORDER BY Orders.OrderID;
		 * 
		 * SELECT Customers.CustomerName, Orders.OrderID FROM Customers FULL
		 * OUTER JOIN Orders ON Customers.CustomerID=Orders.CustomerID ORDER BY
		 * Customers.CustomerName;
		 * 
		 * SELECT A.CustomerName AS CustomerName1, B.CustomerName AS
		 * CustomerName2, A.City FROM Customers A, Customers B WHERE
		 * A.CustomerID <> B.CustomerID AND A.City = B.City ORDER BY A.City;
		 * 
		 * SELECT City FROM Customers UNION ALL SELECT City FROM Suppliers ORDER
		 * BY City;
		 * 
		 * SELECT City, Country FROM Customers WHERE Country='Germany' UNION
		 * SELECT City, Country FROM Suppliers WHERE Country='Germany' ORDER BY
		 * City;
		 *
		 */

	}

}

// jdbc: java db connectivity

// framework/api: interfaces, classes

// to use to manage data

// connect java to mysql

// connect java to oracle

// jdbc uses the same to connect to various kinds of dbs

// for java programes

// interface: 70%
// class : 30%; abstract : 10%

// when switching from mysql to oracle
// run same java program

// jdbc standards are folowed the same

// jdbc to connect to db

// java->jdbc->db

// oracle, mysql...dbs will implemtn all the
// interfaces/abstract classes

// db vendors implemtns all the interfaces
// abstract classes
