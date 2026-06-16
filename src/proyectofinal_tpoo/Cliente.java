/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

/**
 *
 * @author USUARIO
 */
public class Cliente extends Persona{
    private String codigoCliente;
    private int puntosAcumulados;
    private String tipoCliente;

    public Cliente() {
    }
    
    // Constructor con parámetros
    public Cliente(String codigoCliente,int puntosAcumulados, String tipoCliente) {
        this.codigoCliente = codigoCliente;
        this.puntosAcumulados = puntosAcumulados;
        this.tipoCliente = tipoCliente;
    }
    
    // Getters y Setters

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Integer getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(Integer puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // Métodos
    public void registrarCliente() {

    }

    public void actualizarDatos() {

    }

    public Integer consultarPuntos() {
        return puntosAcumulados;
    }
}
