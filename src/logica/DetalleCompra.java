/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author USUARIO
 */
public class DetalleCompra {
    private int cantidad;
    private double precioCompra;
    private double subtotal;
    
    private Producto producto;
    public DetalleCompra() {}
    
    // Constructor 
    public DetalleCompra(int cantidad, double precioCompra) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.subtotal = calcularSubtotal();
    }

    public DetalleCompra(int cantidad, double precioCompra, Producto producto) {
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.producto = producto;
        this.subtotal = calcularSubtotal();
    }

    // G y S
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal(); 
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
       this.precioCompra = precioCompra;
        this.subtotal = calcularSubtotal(); 
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
        this.subtotal = calcularSubtotal();
    }


    // Método 
    public double calcularSubtotal() {
        return cantidad * precioCompra;
    }

    public void mostrarDetalle() {

        System.out.println("DETALLE COMPRA");

        if (producto != null) {
            System.out.println("Producto: " + producto.getNomProducto());
        } else {
            System.out.println("Producto: SIN ASIGNAR");
        }

        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Compra: " + precioCompra);
        System.out.println("Subtotal: " + subtotal);
    }
}
