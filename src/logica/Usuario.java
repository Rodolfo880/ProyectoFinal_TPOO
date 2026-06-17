/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String rol;
    private boolean estado;

    public Usuario() {
    }
    
    public Usuario(int idUsuario, String nombreUsuario, String contrasena,
                   String rol, boolean estado) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
        this.estado = estado;
    }
    
     // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
     //metodos
    public void iniciarSesion(){
        System.out.println("Usuario iniciando sesión: " + nombreUsuario);
    }
    public void cerrarSesion(){
        System.out.println("Sesión cerrada: " + nombreUsuario);
    }
}
