/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pk;

import modelo.utils.PK;

/**
 *
 * @author pseudocfoch
 */
public class RutinaPK extends PK {
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
    private String IdRutina;
    private int DNICliente;
    private int DNIEntrenador;

    public RutinaPK(String IdRutina, int DNICliente, int DNIEntrenador) {
        this.IdRutina = IdRutina;
        this.DNICliente = DNICliente;
        this.DNIEntrenador = DNIEntrenador;
    }
    
    
}
