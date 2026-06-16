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
public class CarritoVenta {
    private int cantidadProductos;
    
    //Relación de agregación con Producto
    private ArrayList<Producto> productos;
    
    // Constructor vacío
    public CarritoVenta() {
        productos = new ArrayList<>();
    }
    
    // Constructor con parámetros
    public CarritoVenta(int cantidadProductos, ArrayList<Producto> productos) {
        this.cantidadProductos = cantidadProductos;
        this.productos = productos;
    }
    
     // Getters y Setters

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
     // Métodos del UML
    public void agregarProducto() {
    }

    public void eliminarProducto() {
    }

    public double calcularTotal() {
        return 0;
    }

    public void vaciarCarrito() {
    }
}
