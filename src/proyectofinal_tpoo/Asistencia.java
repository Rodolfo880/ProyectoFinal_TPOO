/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal_tpoo;
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

    public Asistencia() {
    }
    
    // Constructor con parámetros
    public Asistencia(Integer idAsistencia, Date fecha, Time horaEntrada,
                      Time horaSalida, String observacion) {
        this.idAsistencia = idAsistencia;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.observacion = observacion;
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

    // Métodos

    public void registrar() {

    }

    public void consultar() {

    }
}
