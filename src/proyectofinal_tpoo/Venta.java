/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Venta {
     // Atributos
    private int idVenta;
    private Date fecha;
    private Time hora;
    private double subtotal;
    private double igv;
    private double total;
    
    // Composición con DetalleVenta
    private ArrayList<DetalleVenta> detallesVenta;

    // Constructor vacío
    public Venta() {
        detallesVenta = new ArrayList<>();
    }
    
    // Constructor con parámetros
    public Venta(int idVenta, Date fecha, Time hora, double subtotal,
                 double igv, double total, ArrayList<DetalleVenta> detallesVenta) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.detallesVenta = detallesVenta;
    }

    // Getters y Setters

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
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

    public ArrayList<DetalleVenta> getDetallesVenta() {
        return detallesVenta;
    }

    public void setDetallesVenta(ArrayList<DetalleVenta> detallesVenta) {
        this.detallesVenta = detallesVenta;
    }

    // Métodos
    public void registrarVenta() {
         System.out.println("Venta registrada correctamente con ID: " + idVenta);
    }

    public double calcularTotal() {
        subtotal = 0;

        for (DetalleVenta d : detallesVenta) {
            subtotal += d.getSubtotal(); 
        }

        igv = subtotal * 0.18;
        total = subtotal + igv;

        return total;
    }
    
    public void imprimirVenta() {
        System.out.println("IMPRIMIR VENTA");
        System.out.println("ID: " + idVenta);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IGV: " + igv);
        System.out.println("Total: " + total);

        System.out.println("\nDETALLES:");

        for (DetalleVenta d : detallesVenta) {
            d.mostrarDetalle();
        }
    }
    
    public void agregarDetalle(DetalleVenta detalle) {
    if (detalle != null) {
            detallesVenta.add(detalle);
            System.out.println("Detalle agregado correctamente");
        } else {
            System.out.println("Error: detalle vacío");
        }
    }   
}
