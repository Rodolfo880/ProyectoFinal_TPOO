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
        cantidadProductos = 0;
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
        this.cantidadProductos = (productos != null) ? productos.size() : 0;
    }
    
     // Métodos del UML
    public void agregarProducto(Producto producto) {
         if (producto != null) {
            productos.add(producto);
            cantidadProductos = productos.size(); 
            System.out.println("Producto agregado: " + producto.getNomProducto());
        }
    }

    public void eliminarProducto(Producto producto) {
        if (producto != null && productos.remove(producto)) {
            cantidadProductos = productos.size();
            System.out.println("Producto eliminado");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecioVenta(); 
        }
        return total;
    }

    public void vaciarCarrito() {
         productos.clear();
        cantidadProductos = 0;
        System.out.println("Carrito vaciado");
    }
}
