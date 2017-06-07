/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Persona;
import vista.VentanaPrincipal;

/**
 *
 * @author pseudocfoch
 */
public class PrincipalControlador implements ActionListener {
    VentanaPrincipal vista;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public PrincipalControlador(Persona persona, VentanaPrincipal vista) {
        this.persona = persona;
        this.vista = vista;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }
    private Persona persona;

}
