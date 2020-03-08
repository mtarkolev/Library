package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandler {
    String url = "jdbc:mysql://localhost:3306/LibraryDB?serverTimezone=UTC";
    String user = "root";
    String pass = "Tangerjet2332";

    Connection dbConnection;
    Statement statement;



    public Statement createStatement(){

        try{
            dbConnection = DriverManager.getConnection(url,user,pass);
            statement = dbConnection.createStatement();
        }catch (SQLException ex){
            System.out.println(ex);
        }
        return statement;
    }

    public void closeConnection(){
        try{
            dbConnection.close();
        }catch (SQLException ex){

        }

    }
}
