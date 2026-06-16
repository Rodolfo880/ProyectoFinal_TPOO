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
        productos = new ArrayList<>();
    }
    
    public Inventario(int idInventario, int cantidadProductos, ArrayList<Producto> productos) {
       this.idInventario = idInventario;
       this.cantidadProductos = cantidadProductos;
       this.productos = productos;
    }
    
     public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

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
    
    //metodos
    public void agregarProducto() {
    }

    public void eliminarProducto() {
    }

    public Producto buscarProducto() {
        return null;
    }

    public void listarProductos() {
    }

    public void verificarStock() {
    }
}
