/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Compra {
    // Atributos
    private int idCompra;
    private Date fecha;
    private double subtotal;
    private double igv;
    private double total;
    
    //Relación con Proveedor
    private Proveedor proveedor;

    //Relación con DetalleCompra (1..*)
    private ArrayList<DetalleCompra> detallesCompra;

    // Constructor vacío
    public Compra() {
        this.detallesCompra = new ArrayList<>();
    }
    
     // Constructor con parámetros
    public Compra(int idCompra, Date fecha, double subtotal,
                  double igv, double total, Proveedor proveedor) {

        this.idCompra = idCompra;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.proveedor = proveedor;
        this.detallesCompra = new ArrayList<>();
    }

    // Getters y Setters

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<DetalleCompra> getDetallesCompra() {
        return detallesCompra;
    }

    public void setDetallesCompra(ArrayList<DetalleCompra> detallesCompra) {
        this.detallesCompra = detallesCompra;
    }

    // Métodos
    public void registrarCompra() {
        // lógica de registro
    }

    public double calcularTotal() {
        this.total = this.subtotal + this.igv;
        return this.total;
    }
    public void mostrarCompra() {
        System.out.println("ID Compra: " + idCompra);
        System.out.println("Fecha: " + fecha);
        System.out.println("Proveedor: " + (proveedor != null ? proveedor.getRazonSocial() : "N/A"));
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total: " + total);
    }

    public void agregarDetalle(DetalleCompra detalle) {
        detallesCompra.add(detalle);
    }

    public void eliminarDetalle(DetalleCompra detalle) {
        detallesCompra.remove(detalle);
    }
}
