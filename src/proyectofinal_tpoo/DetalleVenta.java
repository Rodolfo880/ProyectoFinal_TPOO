/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

/**
 *
 * @author USUARIO
 */
public class DetalleVenta {
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    // Relación 
    private Producto producto;
    public DetalleVenta() {}

     // Constructor con parámetros
    public DetalleVenta(int cantidad, double precioUnitario) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = calcularSubtotal();
    }

    public DetalleVenta(int cantidad, double precioUnitario, Producto producto) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
        this.subtotal = calcularSubtotal();
    }

    // Getters y Setters
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = calcularSubtotal(); 
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
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
    }

    // Método
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarDetalle() {

        System.out.println("DETALLE VENTA");

        if (producto != null) {
            System.out.println("Producto: " + producto.getNomProducto());
        } else {
            System.out.println("Producto: SIN ASIGNAR");
        }
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: " + precioUnitario);
        System.out.println("Subtotal: " + subtotal);
    }
}
