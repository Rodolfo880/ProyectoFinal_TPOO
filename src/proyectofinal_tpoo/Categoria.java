/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

/**
 *
 * @author USUARIO
 */
public class Categoria {
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private boolean estado;

    public Categoria() {
    }
    
    // Constructor con parámetros
    public Categoria(int idCategoria, String nombre, String descripcion, boolean estado) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    // Getters y Setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    // Métodos
    public void registrarCategoria() {
    }

    public void actualizarCategoria() {
    }

    public void eliminarCategoria() {
    }

    public void consultarCategoria() {
    }
}
