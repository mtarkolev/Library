package controller;


import java.sql.*;

public class ViewBooks {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/LibraryDB?serverTimezone=UTC";
        String user = "root";
        String pass = "Tangerjet2332";


        try {
            Connection connector = DriverManager.getConnection(url, user, pass);
            Statement statement = connector.createStatement();

            ResultSet results2 = statement.executeQuery("SELECT * FROM book");
            System.out.println("------------------------------");
            while(results2.next()){
                int bookId = results2.getInt("id");
                String bookName = results2.getString("bookName");
                System.out.println(bookId +" "+ bookName);
            }
            //-------------------------------------------------------------------------------------------
            System.out.println("test");
            statement.close();
            connector.close();


        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}




