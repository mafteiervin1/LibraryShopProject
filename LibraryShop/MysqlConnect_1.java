/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryShop;

/**
 *
 * @author Bogdan
 */

import java.sql.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;
 
import oracle.jdbc.pool.OracleDataSource;

public class MysqlConnect_1 {
    /*String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
    String uSserid = "proiect";
    String password = "proiect"; 
    Connection conn;
    public void getDBConnection() throws SQLException{
        OracleDataSource ds;
        ds = new OracleDataSource();
        ds.setURL(jdbcUrl);
        conn=ds.getConnection(userid,password);
    }
*/
    
     Connection conn= null;
    public static Connection ConnecrDb(){
    
    try{
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","PROIECT","proiect");
    //JOptionPane.showMessageDialog(null, "Connection Established");C:\Users\9589693153\Documents\NetBeansProjects\PROMA
    return conn;
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, e);
       return null;
       
       }
    
    }
    
}