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
public class Cajero extends Empleado{
    private String turno;
    private ArrayList<Venta> ventas;
    public Cajero() {
        super();
        this.ventas = new ArrayList<>();
    }
    
    // Constructor con parámetro
     public Cajero(int idPersona, String tipoDocumento, String nroDocumento,
                  String appPaterno, String appMaterno, String nombre,
                  Date fechaNacimiento, String sexo,
                  String telefono, String correo, String direccion,
                  boolean estado,
                  String codigoEmpleado, Date fechaIngreso,
                  String cargo, double sueldo, Empleado jefe,
                  String turno) {

        super(idPersona, tipoDocumento, nroDocumento, appPaterno,
              appMaterno, nombre, fechaNacimiento, sexo,
              telefono, correo, direccion, estado,
              codigoEmpleado, fechaIngreso, cargo, sueldo, jefe);

        this.turno = turno;
        this.ventas = new ArrayList<>();
    }
    
     // Getter y Setter
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    // Métodos 

    public void registrarVenta(Venta venta) {
       if (venta != null) {
            ventas.add(venta); 
            System.out.println("Venta registrada por cajero: " + nombre); 
        }
    }

    public void consultarProducto(Producto producto) {
         if (producto != null) {
        System.out.println("PRODUCTO");
        System.out.println("Nombre: " + producto.getNomProducto());
        System.out.println("Marca: " + producto.getMarca());
        System.out.println("Precio Venta: " + producto.getPrecioVenta());
        System.out.println("Stock: " + producto.getStock());
    } else {
           System.out.println("Producto no encontrado");
        }
    }
}
