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
import vista.Ventrenador_perfil;

/**
 *
 * @author pseudocfoch
 */
public class EntrenadorPerfilControlador  implements ActionListener  {
    private Entrenador entrenador;
    private Ventrenador_perfil vista;

    public EntrenadorPerfilControlador(Entrenador entrenador, Ventrenador_perfil vista) {
        this.entrenador = entrenador;
        this.vista = vista;
    }

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @return the vista
     */
    public Ventrenador_perfil getVista() {
        return vista;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
