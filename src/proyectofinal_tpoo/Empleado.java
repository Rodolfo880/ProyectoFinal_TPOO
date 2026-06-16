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
public class Empleado {
    private String codigoEmpleado;
    private Date fechaIngreso;
    private String cargo;
    private Double sueldo;
    private Boolean estado;
    private Empleado jefe;
    private ArrayList<Empleado> subordinados;
    
    //Constructor
    public Empleado() {
        subordinados = new ArrayList<>();
    }
    
    // Constructor con parámetros
    public Empleado(String codigoEmpleado, Date fechaIngreso, String cargo,
                    Double sueldo, Boolean estado, Empleado jefe,
                    ArrayList<Empleado> subordinados) {

        this.codigoEmpleado = codigoEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.estado = estado;
        this.jefe = jefe;
        this.subordinados = subordinados;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
    
    //Metodos
     public void registrarAsistencia() {

    }

    public Double calcularSueldo() {
        return sueldo;
    }

    public void mostrarDatosEmpleado() {

    }
}
