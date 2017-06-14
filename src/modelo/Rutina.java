/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Lin
 */
public class Rutina {
    private String IdRutina;
    private int DNICliente;
    private int DNIEntrenador;
    private String nombRutina;
    private String descRutina;
    private Date fechaIni;
    private Date fechaFin;
    
    
    public Rutina(){
        
    }
    
    public Rutina(String id, int dniC, int dniE, String nombR, String descR, Date fecIni, Date fecFin){
        this.IdRutina = id;
        this.DNICliente = dniC;
        this.DNIEntrenador = dniE;
        this.nombRutina = nombR;
        this.descRutina = descR;
        this.fechaIni = fecIni;
        this.fechaFin = fecFin;
    }
    
    /**
     * @return the IdRutina
     */
    public String getIdRutina() {
        return IdRutina;
    }

    /**
     * @param IdRutina the IdRutina to set
     */
    public void setIdRutina(String IdRutina) {
        this.IdRutina = IdRutina;
    }

    /**
     * @return the DNICliente
     */
    public int getDNICliente() {
        return DNICliente;
    }

    /**
     * @param DNICliente the DNICliente to set
     */
    public void setDNICliente(int DNICliente) {
        this.DNICliente = DNICliente;
    }

    /**
     * @return the DNIEntrenador
     */
    public int getDNIEntrenador() {
        return DNIEntrenador;
    }

    /**
     * @param DNIEntrenador the DNIEntrenador to set
     */
    public void setDNIEntrenador(int DNIEntrenador) {
        this.DNIEntrenador = DNIEntrenador;
    }

    /**
     * @return the nombRutina
     */
    public String getNombRutina() {
        return nombRutina;
    }

    /**
     * @param nombRutina the nombRutina to set
     */
    public void setNombRutina(String nombRutina) {
        this.nombRutina = nombRutina;
    }

    /**
     * @return the descRutina
     */
    public String getDescRutina() {
        return descRutina;
    }

    /**
     * @param descRutina the descRutina to set
     */
    public void setDescRutina(String descRutina) {
        this.descRutina = descRutina;
    }

    /**
     * @return the fechaIni
     */
    public Date getFechaIni() {
        return fechaIni;
    }

    /**
     * @param fechaIni the fechaIni to set
     */
    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
}
