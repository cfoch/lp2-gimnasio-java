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
public class Entrenador extends Empleado {
    private String especialidad;

    private int cantidadMaximaClientes;
    private int cantidadClientesDisponibles;

    public Entrenador() {
    }

    /**
     * @return the cantidadMaximaClientes
     */
    public int getCantidadMaximaClientes() {
        return cantidadMaximaClientes;
    }

    /**
     * @param cantidadMaximaClientes the cantidadMaximaClientes to set
     */
    public void setCantidadMaximaClientes(int cantidadMaximaClientes) {
        this.cantidadMaximaClientes = cantidadMaximaClientes;
    }

    /**
     * @return the cantidadClientesDisponibles
     */
    public int getCantidadClientesDisponibles() {
        return cantidadClientesDisponibles;
    }

    /**
     * @param cantidadClientesDisponibles the cantidadClientesDisponibles to set
     */
    public void setCantidadClientesDisponibles(int cantidadClientesDisponibles) {
        this.cantidadClientesDisponibles = cantidadClientesDisponibles;
    }
    
    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
