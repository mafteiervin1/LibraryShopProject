/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_commands;

import JavaApplication14.MysqlConnect_1;
import java.sql.SQLException;

/**
 *
 * @author Ervin
 */
public class NewClass {
    
    
     public static void main(String args[]) throws SQLException {
        Userss a=new Userss();
        System.out.println(a.getEmail());
    }
    
}
