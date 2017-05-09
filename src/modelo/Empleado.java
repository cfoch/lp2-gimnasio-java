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
    private String Cargo;
    private float Sueldo;
    private String Area;
    private Date horaInicio;
    private Date horaFin;
    private String tipoHorario;
    private String cuentaBancaria;

    
    public Empleado(String _cargo, float _sueldo, String _area, Date _horaInicio, Date _horaFin, String _tipoHorario, 
        String _cuentaBancaria, int dni, Jerarquia jerarquia, String nombre, String apPat, String apMat, String email, Date fechaNac, String telf, String dist) {
        super(dni,  jerarquia,  nombre ,  apPat,  apMat,  email,  fechaNac ,  telf,  dist);
        this.Cargo = _cargo;
        this.Sueldo = _sueldo;
        this.Area = _area;
        this.horaInicio = _horaInicio;
        this.horaFin = _horaFin;
        this.tipoHorario = _tipoHorario;
        this.cuentaBancaria = _cuentaBancaria;
    }
    
    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the Sueldo
     */
    public float getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(float Sueldo) {
        this.Sueldo = Sueldo;
    }

    /**
     * @return the Area
     */
    public String getArea() {
        return Area;
    }

    /**
     * @param Area the Area to set
     */
    public void setArea(String Area) {
        this.Area = Area;
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
    
    
}
