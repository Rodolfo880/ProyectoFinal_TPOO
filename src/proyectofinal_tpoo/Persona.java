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
public class Persona {
    protected Integer idPersona;
    protected String tipoDocumento;
    protected String nroDocumento;
    protected String appPaterno;
    protected String appMaterno;
    protected String nombre;
    protected Date fechaNacimiento;
    protected String sexo;
    protected String telefono;
    protected String correo;
    protected String direccion;
    protected Boolean estado;

    public Persona() {
    }
    
    public Persona(Integer idPersona, String tipoDocumento, String nroDocumento,
                   String appPaterno, String appMaterno, String nombre,
                   Date fechaNacimiento, String sexo, String telefono,
                   String correo, String direccion, Boolean estado) {

        this.idPersona = idPersona;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.appPaterno = appPaterno;
        this.appMaterno = appMaterno;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estado = estado;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getAppPaterno() {
        return appPaterno;
    }

    public void setAppPaterno(String appPaterno) {
        this.appPaterno = appPaterno;
    }

    public String getAppMaterno() {
        return appMaterno;
    }

    public void setAppMaterno(String appMaterno) {
        this.appMaterno = appMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }  
    
    //Metodos
     public void mostrarDatos() {

    }

    public int calcularEdad() {
        return 0;
    }
}
