/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igu;
import persistencia.Conexion;
/**
 *
 * @author USUARIO
 */
public class ProyectoFinal_TPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VistaUsuario usu = new VistaUsuario();
        usu.setLocationRelativeTo(null);
        usu.setVisible(true);
        
          
        Conexion.conectar();
    }
}
