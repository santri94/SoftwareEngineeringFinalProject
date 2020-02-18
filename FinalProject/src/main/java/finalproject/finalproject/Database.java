 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject.finalproject;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kuervo
 */
public class Database {
    
    public static class DatabaseFunctions{
        
            public Connection getConnection()throws Exception{

                try {
                    String driver = "com.mysql.jdbc.Driver";
                    String url = "jdbc:mysql://remotemysql.com:3306/IrzI7vdDJz";
                    String username = "IrzI7vdDJz";
                    String password = "TooHnw7IeH";
                    Class.forName(driver);

                    Connection conn = DriverManager.getConnection(url, username, password);
                    System.out.println("Connected");

                    return conn;
                } catch (Exception e) {
                    System.out.println("An error has occured");
                    System.out.println(e);
                }

            return null;
    }
            
            public User GetUser(String usernameEntered, String passwordEntered) throws Exception{
                
    
                User testUser;


                    Statement stmt = null;
                    Connection conn = getConnection();
                    String query = "SELECT * FROM USERR WHERE Email='"+usernameEntered+"'";
                try {
                    //boolean valid;
                    stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        String email = rs.getString("Email");
                        String userPassword = rs.getString("Pass");
                        String type = rs.getString("Type");
                        String firstName = rs.getString("F_Name");
                        String lastName = rs.getString("L_Name");
                        String phone = rs.getString("Phone");
                        String address = rs.getString("Address");

                        testUser = new User(email, userPassword, type, firstName, lastName, phone, address);


                        if (testUser.Email.equals(usernameEntered)&& testUser.Pass.equals(passwordEntered)) {
                            //JOptionPane.showMessageDialog(this, "Log In Succesfull");
                            //System.out.println("Log In Succesfull!");
                            return testUser;
                        }
                        else{
                            //System.out.println("Please try again");
                            return null;
                        }
                    }
                } catch (SQLException e ) {
                    System.err.println(e);
                } finally {
                    if (stmt != null) { stmt.close(); }
                }
                    return null;

                }
            
            
            
        
    }
    
}
