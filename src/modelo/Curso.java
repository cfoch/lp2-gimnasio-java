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
public class Curso {
    private int id;
    private int DNIEntrenador;
    private String nombCurso;
    private String descripcion;
    private int capacidad;
    private int vacantes;
    private Date fechaInicio;
    private Date fechaFin;
    private int disponibilidad;
    
    
    private int duracion; //en minutos
    
    
    public Curso(int id, int dniE, String nombC, String desc, int cap, int vac, Date fecI, Date fecF, int disp){
        this.id = id;
        this.DNIEntrenador = dniE;
        this.nombCurso = nombC;
        this.descripcion = desc;
        this.capacidad = cap;
        this.vacantes = vac;
        this.fechaInicio = fecI;
        this.fechaFin = fecF;
        this.disponibilidad = disp;
    }

    public Curso(int vacantes, Date fechaInicio, Date fechaFin) {
        this.vacantes = vacantes;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the vacantes
     */
    public int getVacantes() {
        return vacantes;
    }

    /**
     * @param vacantes the vacantes to set
     */
    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
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

    /**
     * @return the disponibilidad
     */
    public int getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return the nombCurso
     */
    public String getNombCurso() {
        return nombCurso;
    }

    /**
     * @param nombCurso the nombCurso to set
     */
    public void setNombCurso(String nombCurso) {
        this.nombCurso = nombCurso;
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
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    
}
