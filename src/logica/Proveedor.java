/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

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
        super();
    }
    
    // Constructor con parámetros
     public Proveedor(String ruc, String razonSocial, String correoEmpresa,
                     String telefonoEmpresa, String contacto) {

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
        if (razonSocial != null && !razonSocial.isEmpty()) {
            System.out.println("Proveedor registrado: " + razonSocial);
        } else {
            System.out.println("Error: razón social vacía");
        }
    }

    public void actualizarProveedor() {
        if (ruc != null && !ruc.isEmpty()) {
            System.out.println("Proveedor actualizado: " + razonSocial);
        } else {
            System.out.println("Error: proveedor no válido");
        }
    }

    public void consultarProveedor() {
        if (razonSocial != null) {
            System.out.println("PROVEEDOR");
            System.out.println("RUC: " + ruc);
            System.out.println("Razón Social: " + razonSocial);
            System.out.println("Contacto: " + contacto);
            System.out.println("Teléfono: " + telefonoEmpresa);
        } else {
            System.out.println("Proveedor no registrado");
        }
    }
}
