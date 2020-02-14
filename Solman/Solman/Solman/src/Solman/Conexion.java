package Solman;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ESTUDIANTE
 */
public class Conexion {

 public boolean conectar()
 {
     boolean res= false;
   
   //Nombre de la base de datos
   String bd="Taller";
   String dsn="jdbc:sqlserver://ESTUDIANTE;databaseName=" + bd + ";user=sa;password=1234";
   try
    {
      //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//Verifica si existe el Driver apropiado
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     }
    catch(ClassNotFoundException er)
     {
       System.out.println("error al cargar el driver");
       System.out.println(er.getMessage());
       System.exit(1);
       }
      try
       {
         //Connection con = DriverManager.getConnection(dsn);
         Connection cn = DriverManager.getConnection(dsn); //Crea coneccion.
         res= true;
         
        }
       catch(SQLException sqlEx)
       { 
         System.out.println("error al comunicarse la base de datos");
	 System.out.println(sqlEx.getMessage());
	 System.exit(1);
        }
         System.out.println("conexion lista a "+ bd); 
        return res;     
       }
}
    

