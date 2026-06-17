/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

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
    public Compra(int idCompra, Date fecha, Proveedor proveedor) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.proveedor = proveedor;

        this.detallesCompra = new ArrayList<>();
        this.subtotal = 0; 
        this.igv = 0;      
        this.total = 0;   
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
        calcularTotal();
        System.out.println("Compra registrada correctamente");
    }

    public void calcularTotal() {
       subtotal = 0;
       
        if (detallesCompra != null) {

            for (DetalleCompra d : detallesCompra) {
                subtotal += d.getSubtotal();
            }
        }
        igv = subtotal * 0.18;
        total = subtotal + igv;
    }
    
    public void mostrarCompra() {
            System.out.println("COMPRA");
            System.out.println("ID: " + idCompra);
            System.out.println("Proveedor: " +
                (proveedor != null ? proveedor.getRazonSocial() : "SIN PROVEEDOR"));
            System.out.println("Subtotal: " + subtotal);
            System.out.println("IGV (18%): " + igv);
            System.out.println("Total: " + total);
    }

    public void agregarDetalle(DetalleCompra detalle) {
        if (detallesCompra != null && detalle != null) {
            detallesCompra.add(detalle);
            calcularTotal();
        }
    }

    public void eliminarDetalle(DetalleCompra detalle) {
        if (detallesCompra != null && detalle != null) {
            detallesCompra.remove(detalle);
            calcularTotal();
        }
    }
}
