/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jom.upload;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Juan
 */
public class conexionDB {
    
 
    public void conexion(String nombre, String ruta, String Parent, String idParent){
      try{  
      Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@172.30.10.3:1521:segint1", "med", "med");
      Statement st = con.createStatement();
      System.out.println("conexión realizada");
      
      ResultSet rs = st.executeQuery("insert into mdt.adjuntos (id_adjuntos, nombre, ruta, fecha, parent, idparent) values (mdt.adjuntos_seq.nextval,'"+nombre+"','"+ruta+"',sysdate,'"+Parent+"','"+idParent+"')");
      //while(rs.next()){
       // System.out.println(rs.getInt("id_caso"));
      //}
      } catch(Exception e){
          e.printStackTrace();
      }
    }
   
}
