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
import java.util.ArrayList;
import modelo.Entrenador;
import modelo.Persona;
import vista.VentanaAutenticacion;

/**
 *
 * @author pseudocfoch
 */
public class AutenticacionControlador implements ActionListener {
    private VentanaAutenticacion vista;
    private Entrenador entrenador;
    private boolean esperando;
    
    public AutenticacionControlador(VentanaAutenticacion ventana) {
        this.entrenador = null;
        this.esperando = true;
        this.vista = ventana;
    }

    public AutenticacionControlador() {
        this.entrenador = null;
        this.esperando = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd;
        cmd = e.getActionCommand();
        if (cmd.equals(VentanaAutenticacion.Action.ENTRAR_CLICKED)) {
            EntrenadorDAO entrenadorDAO;
            int login;
            boolean autenticacionValida;
            String contrasena;

            entrenadorDAO = new EntrenadorDAO();
            
            login = getVista().getLogin();
            contrasena = getVista().getConstrasena();
            entrenador = entrenadorDAO.read(login);
            
            autenticacionValida = getEntrenador() != null &&
                    getEntrenador().compararContrasena(contrasena);

            if (autenticacionValida) {
                this.vista.mostrarDialogoExito();
                this.getVista().setVisible(false);
            } else
                this.vista.mostrarDialogoError();
        }
    }

    /**
     * @return the esperando
     */
    public boolean isEsperando() {
        return esperando;
    }

    /**
     * @param esperando the esperando to set
     */
    public void setEsperando(boolean esperando) {
        this.esperando = esperando;
    }

    /**
     * @return the vista
     */
    public VentanaAutenticacion getVista() {
        return vista;
    }

    /**
     * @param vista the vista to set
     */
    public void setVista(VentanaAutenticacion vista) {
        this.vista = vista;
    }

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }
}
