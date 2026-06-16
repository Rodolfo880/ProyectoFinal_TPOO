/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

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
    
    public Reporte() {}
    
    // Constructor con parámetros
    public Reporte(int idReporte, Date fechaInicio, Date fechaFin,
                   String tipoReporte, Inventario inventario) {
        this.idReporte = idReporte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoReporte = tipoReporte;
        this.inventario = inventario;
    }

    // Getters y Setters
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

    // Métodos
    public void reporteVentas() {
        // lógica pendiente
    }

    public void reporteInventario() {
        // lógica pendiente
    }

    public void exportarReporte() {
        // lógica pendiente
    }

    public void visualizarReporte() {
        // lógica pendiente
    }
}
