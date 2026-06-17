/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Cliente extends Persona{
    private String codigoCliente;
    private int puntosAcumulados;
    private String tipoCliente;
    
    private ArrayList<Venta> ventas;
    public Cliente() {
        super();
        this.ventas = new ArrayList<>();
    }
    
    // Constructor con parámetros
     public Cliente(int idPersona, String tipoDocumento, String nroDocumento,
                   String appPaterno, String appMaterno, String nombre,
                   java.util.Date fechaNacimiento, String sexo,
                   String telefono, String correo, String direccion,
                   boolean estado,
                   String codigoCliente, int puntosAcumulados, String tipoCliente) {

        super(idPersona, tipoDocumento, nroDocumento, appPaterno,
              appMaterno, nombre, fechaNacimiento, sexo,
              telefono, correo, direccion, estado);

        this.codigoCliente = codigoCliente;
        this.puntosAcumulados = puntosAcumulados;
        this.tipoCliente = tipoCliente;

        this.ventas = new ArrayList<>();
    }

    
    // Getters y Setters
    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }
    
    // Métodos
    public void agregarVenta(Venta venta) {
        if (venta != null) {
            ventas.add(venta); 
        }
    }
    public void registrarCliente() {
          System.out.println("Cliente registrado: " + getNombre());
    }

    public void actualizarDatos() {
         System.out.println("Datos del cliente actualizados");
    }

    public int consultarPuntos() {
        return puntosAcumulados;
    }
}
