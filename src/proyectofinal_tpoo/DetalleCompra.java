/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

/**
 *
 * @author USUARIO
 */
public class DetalleCompra {
    private int cantidad;
    private double precioCompra;
    private double subtotal;
    
    public DetalleCompra() {}
    
    // Constructor 
    public DetalleCompra(int cantidad, double precioCompra, double subtotal) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
    }

    // G y S
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    // Método 
    public double calcularSubtotal() {
        this.subtotal = this.cantidad * this.precioCompra;
        return this.subtotal;
    }
}
