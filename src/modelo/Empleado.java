/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.Date;

/**
 *
 * @author pseudocfoch
 */
public class Empleado extends Persona {
    private Turno turno;
    private String cargo;
    private float sueldo;
    private String area;
    private Date horaInicio;
    private Date horaFin;
    private String tipoHorario;
    private String cuentaBancaria;
    private String estadoLaboral;

    public Empleado(){
        
    }
    

    /**
     * @return the estadoLaboral
     */
    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    /**
     * @param estadoLaboral the estadoLaboral to set
     */
    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }

    
    /**
     * @return the cargo
     */
    public String getcargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setcargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the sueldo
     */
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the horaInicio
     */
    public Date getHoraInicio() {
        return horaInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @return the horaFin
     */
    public Date getHoraFin() {
        return horaFin;
    }

    /**
     * @param horaFin the horaFin to set
     */
    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    /**
     * @return the tipoHorario
     */
    public String getTipoHorario() {
        return tipoHorario;
    }

    /**
     * @param tipoHorario the tipoHorario to set
     */
    public void setTipoHorario(String tipoHorario) {
        this.tipoHorario = tipoHorario;
    }

    /**
     * @return the cuentaBancaria
     */
    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    /**
     * @param cuentaBancaria the cuentaBancaria to set
     */
    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    /**
     * @return the turno
     */
    public Turno getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    
}
