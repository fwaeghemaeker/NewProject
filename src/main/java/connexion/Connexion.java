/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.DriverManager;

import java.sql.Connection;

public class Connexion {

public Connection conn;



{
String url = "jdbc:mysql://localhost:3306/";
String dbName;
dbName = "banque"; // nom de la base
String driver = "com.mysql.cj.jdbc.Driver"; // "com.mysql.jdbc.Driver";
String userName = "admin";
String password = "formation";
try {
Class.forName(driver).newInstance();



conn = DriverManager.getConnection(url + dbName, userName, password);
System.out.println("la connexion a reussie");
} catch (Exception e) {
System.out.println(e.getMessage());
}
}
}