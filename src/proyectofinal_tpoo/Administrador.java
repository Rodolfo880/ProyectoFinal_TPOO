/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Administrador extends Empleado {
    private String nivelAcceso;
    //Relacion
    private ArrayList<Reporte> reportes;
    //Super
    public Administrador() {
        super();
        this.reportes = new ArrayList<>();
    }
    
    //parametros
    public Administrador(int idPersona, String tipoDocumento, String nroDocumento,
                         String appPaterno, String appMaterno, String nombre,
                         java.util.Date fechaNacimiento, String sexo,
                         String telefono, String correo, String direccion,
                         boolean estado,
                         String codigoEmpleado, java.util.Date fechaIngreso,
                         String cargo, double sueldo, Empleado jefe,
                         String nivelAcceso) {

        super(idPersona, tipoDocumento, nroDocumento, appPaterno,
              appMaterno, nombre, fechaNacimiento, sexo,
              telefono, correo, direccion, estado,
              codigoEmpleado, fechaIngreso, cargo, sueldo, jefe);

        this.nivelAcceso = nivelAcceso;
        this.reportes = new ArrayList<>();
    }
    
     //get y set
     public String getNivelAcceso() {
        return nivelAcceso;
    }
     public ArrayList<Reporte> getReportes() {
        return reportes;
    }

    public void setReportes(ArrayList<Reporte> reportes) {
        this.reportes = reportes;
    }

    public void setNivelAcceso(String nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    // Métodos del UM
    public void gestionarProductos() {
        System.out.println("Administrador gestionando productos...");
    }
    public void gestionarUsuarios() {
        System.out.println("Administrador gestionando usuarios...");
    }
    public void generarReportes(Reporte reporte) {
          if (reporte != null) {
            reportes.add(reporte);
            reporte.setAdministrador(this);
            System.out.println("Reporte generado correctamente");
        }
    }
}
