package com.gutsu.model;
import java.sql.Connection;
import java.sql.DriverManager;
public class Conexiunea {
    String url="jdbc:mysql://localhost:3306/bd_ejemplo";
    String user="root",pass="root";    
    Connection con;
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {            
        }
        return con;
    }
}
