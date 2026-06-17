/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Asistencia {
    private int idAsistencia;
    private Date fecha;
    private Time horaEntrada;
    private Time horaSalida;
    private String observacion;
    
    private Empleado empleado;
    public Asistencia() {
    }
    
    // Constructor con parámetros
    public Asistencia(Integer idAsistencia, Date fecha, Time horaEntrada,
                  Time horaSalida, String observacion, Empleado empleado) {

                  this.idAsistencia = idAsistencia;
                  this.fecha = fecha;
                  this.horaEntrada = horaEntrada;
                  this.horaSalida = horaSalida;
                  this.observacion = observacion;
                  this.empleado = empleado; 
    }
    
    // Getters y Setters
    public Integer getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(Integer idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    // Métodos

    public void registrar() {
        System.out.println("Asistencia registrada para el empleado: " +
        (empleado != null ? empleado.getNombre() : "SIN EMPLEADO"));
    }

    public void consultar() {
          System.out.println("ASISTENCIA");
          System.out.println("Empleado: " +
         (empleado != null ? empleado.getNombre() : "SIN EMPLEADO"));
          System.out.println("Fecha: " + fecha);
          System.out.println("Hora Entrada: " + horaEntrada);
          System.out.println("Hora Salida: " + horaSalida);
          System.out.println("Observación: " + observacion);
    }
    public long calcularHorasTrabajadas() {
    if (horaEntrada != null && horaSalida != null) {
        return horaSalida.getTime() - horaEntrada.getTime();
    }
      return 0;
    }
}
