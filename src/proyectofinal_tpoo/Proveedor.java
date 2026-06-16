/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;

/**
 *
 * @author USUARIO
 */
public class Proveedor extends Persona{
    private String ruc;
    private String razonSocial;
    private String correoEmpresa;
    private String telefonoEmpresa;
    private String contacto;
    
    public Proveedor() {
    }
    
    // Constructor con parámetros

    public Proveedor(String ruc, String razonSocial, String correoEmpresa, String telefonoEmpresa, String contacto) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.correoEmpresa = correoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.contacto = contacto;
    }
    
    // Getters y Setters

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    // Métodos
    public void registrarProveedor() {
    }

    public void actualizarProveedor() {
    }

    public void consultarProveedor() {
    }
}
