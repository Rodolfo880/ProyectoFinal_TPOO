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
public class Empleado extends Persona{
    private String codigoEmpleado;
    private Date fechaIngreso;
    private String cargo;
    private double sueldo;
    
    // Relación reflexiva
    private Empleado jefe;
    private ArrayList<Empleado> subordinados;
    
    //Constructor
    public Empleado() {
       super();
       this.subordinados = new ArrayList<>();
    }
    
       public Empleado(int idPersona, String tipoDocumento, String nroDocumento,
                    String appPaterno, String appMaterno, String nombre,
                    Date fechaNacimiento, String sexo,
                    String telefono, String correo, String direccion,
                    boolean estado,
                    String codigoEmpleado, Date fechaIngreso,
                    String cargo, double sueldo, Empleado jefe) {

        super(idPersona, tipoDocumento, nroDocumento, appPaterno,
              appMaterno, nombre, fechaNacimiento, sexo,
              telefono, correo, direccion, estado);

        this.codigoEmpleado = codigoEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.jefe = jefe;
        //Inicializacion
         this.subordinados = new ArrayList<>();
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
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
    
     //Mtodos
    public void registrarAsistencia() {
        System.out.println("Asistencia registrada del empleado: " + nombre);
    }
    public double calcularSueldo() {
        return sueldo;
    }
    public void mostrarDatosEmpleado() {
        System.out.println("EMPLEADO");
        mostrarDatos();
        System.out.println("Cargo: " + cargo);
        System.out.println("Sueldo: " + sueldo);
    }
}
