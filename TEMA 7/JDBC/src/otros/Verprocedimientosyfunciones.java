package otros;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Verprocedimientosyfunciones {

	public static void main(String[] args) {
		try {
			// conexion a ORACLE
			/*
			  Class.forName ("oracle.jdbc.driver.OracleDriver"); Connection
			  conexion = DriverManager.getConnection
			  ("jdbc:oracle:thin:@localhost:1521:XE", "ejemplo", "ejemplo");
			 */

			//Class.forName("com.mysql.jdbc.Driver"); // Cargar el driver
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemploScript?useSSL=false&serverTimezone=UTC", "root", "root");

			DatabaseMetaData dbmd = conexion.getMetaData();// Creamos objeto
			// DatabaseMetaData

			System.out.println("-- PROCEDIMIENTOS --");
			ResultSet proc = dbmd.getProcedures(null, "ejemplo", null);
			while (proc.next()) {
				String proc_name = proc.getString("PROCEDURE_NAME");
				String proc_type = proc.getString("PROCEDURE_TYPE");
				System.out.printf("Nombre Procedimiento: %s - Tipo: %s %n", proc_name, proc_type);
			}

			System.out.println("-- FUNCIONES --");
			ResultSet func = dbmd.getFunctions(null, "ejemplo", null);
			while (func.next()) {
				String func_name = func.getString("FUNCTION_NAME");
				String func_type = func.getString("FUNCTION_TYPE");
				System.out.printf("Nombre Función: %s - Tipo: %s %n", func_name, func_type);
			}
//		} catch (ClassNotFoundException cn) {
//			cn.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// fin de main

}
