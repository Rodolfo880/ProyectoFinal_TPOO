/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Categoria {
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private boolean estado;
    
    private ArrayList<Producto> productos;
    public Categoria() {
        productos = new ArrayList<>();
    }
    
    // Constructor con parámetros
    public Categoria(int idCategoria, String nombre, String descripcion, boolean estado) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;

        this.productos = new ArrayList<>();
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
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    // Métodos
    public void agregarProducto(Producto producto) { 
        if (producto != null) {
            productos.add(producto);
        }
    }
    public void registrarCategoria() {
        System.out.println("Categoría registrada: " + nombre);
    }

    public void actualizarCategoria() {
         System.out.println("Categoría actualizada");
    }

    public void eliminarCategoria() {
        System.out.println("Categoría eliminada");
    }

    public void consultarCategoria() {
        System.out.println("Categoría: " + nombre + " - " + descripcion);
    }
}
