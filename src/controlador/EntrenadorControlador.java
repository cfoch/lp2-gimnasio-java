/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Entrenador;
import vista.VentanaEntrenador;

/**
 *
 * @author pseudocfoch
 */
public class EntrenadorControlador implements ActionListener {
    private VentanaEntrenador vista;
    private Entrenador entrenador;
    
    public EntrenadorControlador(VentanaEntrenador vista, Entrenador entrenador) {
        this.vista = vista;
        this.entrenador = entrenador;
    }

    /**
     * @return the vista
     */
    public VentanaEntrenador getVista() {
        return vista;
    }

    /**
     * @param vista the vista to set
     */
    public void setVista(VentanaEntrenador vista) {
        this.vista = vista;
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public EntrenadorControlador(Entrenador entrenador, VentanaEntrenador vista) {
        this.vista = vista;
        this.entrenador = entrenador;
    }

    
}
