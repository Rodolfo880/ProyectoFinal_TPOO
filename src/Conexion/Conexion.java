/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author USUARIO
 */
public class Conexion {
    // Datos de conexión MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_supermercado";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método para obtener conexión
    public Connection getConexion() {

        Connection con = null;

        try {
            // Cargar driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Conectar a la base de datos
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa a MySQL");

        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se encontro el Driver MySQL");
        } catch (SQLException e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }

        return con;
    }
}
