package otros;

import java.sql.*;

public class FuncNombreMysql {
    public static void main(String[] args) throws ClassNotFoundException {
        try {

            //Class.forName("com.mysql.jdbc.Driver"); 
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empresa_clase22?useSSL=false&serverTimezone=UTC", "root", "root");

            // recuperar parametro de main
            String dep = "1";// args[0]; //departamento

            // MYSQL
            /*
            * DROP FUNCTION IF EXISTS nombre_dep;
            DELIMITER //
            CREATE FUNCTION nombre_dep(d int)
            RETURNS VARCHAR(15)
            DETERMINISTIC
            BEGIN

               DECLARE dnom VARCHAR(15) DEFAULT "";

               select  NomeD into dnom from departamentos where IdDepaD = d;

               RETURN dnom;

            END //

            DELIMITER ;

            select nombre_dep(1) as 'NombreDep';

		drop procedure if exists datos_dep;
			DELIMITER //
            CREATE PROCEDURE datos_dep(d int, OUT nom VARCHAR(15),
             OUT tel CHAR(3))
            BEGIN
                    SELECT NomeD,ExteD INTO nom,tel FROM departamentos
                    WHERE IdDepaD = d;

            END //

            DELIMITER ;

           call datos_dep(1,@nom,@tel);
           select @nom as 'NomDpto', @tel as 'ExtDpto' ;
            * */
            
            //FUNCTION
            String sql = "{ ? = call nombre_dep (?) } "; // MYSQL

            //PROCEDURE
            String sql2 = "{call datos_dep(?,?,?) } "; // MYSQL

            // Preparamos la llamada
            CallableStatement llamada = conexion.prepareCall(sql);

            CallableStatement llamadaP = conexion.prepareCall(sql2);

            //PROCEDURE
            llamadaP.setInt(1,Integer.parseInt(dep)); // param de entrada
            llamadaP.registerOutParameter(2, Types.VARCHAR); // valor devuelto
            llamadaP.registerOutParameter(3, Types.VARCHAR); // valor devuelto

            llamadaP.executeUpdate(); // ejecutar el procedimiento

            //FUNCTION
            llamada.registerOutParameter(1, Types.VARCHAR);
            llamada.setInt(2,Integer.parseInt(dep)); 
            
            llamada.executeUpdate(); // ejecutar el procedimiento
            
            //PROCEDURE
            System.out.println("Nombre Dep: " + llamadaP.getString(2));
            System.out.println("Loc Dep: " + llamadaP.getString(3));

            //FUNCTION
            System.out.println("Nombre Dep: " + llamada.getString(1));
            
            llamada.close();
            conexion.close();

        } catch (SQLException e) {
                e.printStackTrace();
        }
    }// fin de main
}// fin de la clase