/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.EntrenadorDAO;
import dao.PersonaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Entrenador;
import vista.VentrenadorModPerfil;

/**
 *
 * @author pseudocfoch
 */
public class EntrenadorModificarControlador implements ActionListener {
    private Entrenador entrenador;
    private VentrenadorModPerfil vista;

    public EntrenadorModificarControlador(Entrenador entrenador,
                                          VentrenadorModPerfil vista) {
        this.entrenador = entrenador;
        this.vista = vista;
    }    
    
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equals(VentrenadorModPerfil.Action.MODIFICAR_CLICKED)) {
            PersonaDAO dao;
            dao = new PersonaDAO();
            if (this.getVista().actualizarEntrenador(entrenador))
                if (!dao.update(entrenador)) {
                  this.getVista().mostrarError();
                }
                
        }
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
    public VentrenadorModPerfil getVista() {
        return vista;
    }


}
