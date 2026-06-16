/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

/**
 *
 * @author USUARIO
 */
public class Administrador extends Empleado {
     private String nivelAcceso;
     
     // Constructor vacío
    public Administrador() {
    }
    //parametros
    public Administrador(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }
     //get y set
     public String getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    // Métodos del UM
    public void gestionarProductos() {

    }
    public void gestionarUsuarios() {

    }
    public void generarReportes() {

    }
}
