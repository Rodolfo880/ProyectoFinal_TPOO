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
public class Inventario {
    // Atributos
    private int idInventario;
    private int cantidadProductos;

     // Relación con Producto
    private ArrayList<Producto> productos;

    // Constructor vacío
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public Inventario(int idInventario, ArrayList<Producto> productos) {
        this.idInventario = idInventario;
        this.productos = productos;
    }


    //S y G
    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidadProductos() {
        return productos.size();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    //metodos
    public void agregarProducto(Producto p) {
        if (p != null) {
            productos.add(p);
            System.out.println("Producto agregado: " + p.getNomProducto());
        }
    }

    public void eliminarProducto(Producto p) {
        if (p != null) { 
            productos.remove(p);
            System.out.println("Producto eliminado: " + p.getNomProducto());
        }
    }

    public Producto buscarProducto(String nombre) {
        for (Producto p : productos) {
            if (p.getNomProducto().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void listarProductos() {
         System.out.println("INVENTARIO");

        for (Producto p : productos) {
            System.out.println(p.getNomProducto() + " - Stock: " + p.getStock());
        }
    }

    public void verificarStock() {
        for (Producto p : productos) {
            if (p.getStock() <= p.getStockMinimo()) {
                System.out.println("STOCK BAJO: " + p.getNomProducto());
            }
        }
    }
}
