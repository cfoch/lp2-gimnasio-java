/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pseudocfoch
 */
public class Clase {
    private Entrenador entrenador;
    private Curso curso;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;
    private int capacidad;
    private int vacantes;
    private int duracionEnHoras;
    private String disponibilidad;
    // TODO
    // No estoy seguro si jdbc puede interpretar
    // un tipo Date de Java como TIME de MySQL.
    private Date horaInicio;
    private Date horaFin;
    private ArrayList<Cliente> clientes;

    public Clase(Entrenador entrenador, Curso curso, Date fechaInicio,
            Date fechaFin, String descripcion, int capacidad, int vacantes,
            int duracionEnHoras, String disponibilidad, Date horaInicio,
            Date horaFin) {
        this.entrenador = entrenador;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
        this.vacantes = vacantes;
        this.duracionEnHoras = duracionEnHoras;
        this.disponibilidad = disponibilidad;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.clientes = new ArrayList<>();
    }
    
    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
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
     * @return the duracionEnHoras
     */
    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    /**
     * @param duracionEnHoras the duracionEnHoras to set
     */
    public void setDuracionEnHoras(int duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    /**
     * @return the disponibilidad
     */
    public String getDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
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
    
    public void agregarCliente(Cliente cliente) {
        // TODO
        // Verificar si el cliente ya existe para evitar duplicados.
        this.clientes.add(cliente);
    }
}
