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
public class Reporte {
    private int idReporte;
    private Date fechaInicio;
    private Date fechaFin;
    private String tipoReporte;
    

    // Asociación 1 a 1 con Inventario
    private Inventario inventario;
    private Empleado empleado;
    private ArrayList<Venta> ventas;
    
    public Reporte() { this.ventas = new ArrayList<>();}
    
    // Constructor con parámetros
    public Reporte(int idReporte, Date fechaInicio, Date fechaFin,
                   String tipoReporte, Inventario inventario) {
        this.idReporte = idReporte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoReporte = tipoReporte;
        this.inventario = inventario;
        this.ventas = new ArrayList<>();
    }
   
    // Getters y Setters
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {    
        this.empleado = empleado;
    }

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    

    // Métodos
    public void agregarVenta(Venta v) {
        if (v != null) {
            ventas.add(v);
        }
    }
    public void reporteVentas() {
        System.out.println("REPORTE DE VENTAS");

        for (Venta v : ventas) {
            System.out.println("Venta ID: " + v.getIdVenta() +
                               " | Total: " + v.getTotal());
        }
    }

    public void reporteInventario() {
        System.out.println("REPORTE INVENTARIO");

        if (inventario != null) {
            inventario.listarProductos();
        }
    }

    public void exportarReporte() {
        System.out.println("Exportando reporte ID: " + idReporte);
    }
    
    public void visualizarReporte() {
        if (empleado != null) {
            System.out.println("Generado por: " + empleado.getNombre());
            System.out.println("Cargo: " + empleado.getCargo());
        }
    }
}
