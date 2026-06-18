/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USUARIO
 */


public class Conexion {

    public static Connection conectar() {
        Connection con = null;

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=SistemaVentas;encrypt=true;trustServerCertificate=true";
            String user = "sa";
            String password = "71967573";

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a SQL Server");

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return con;
    }
}
