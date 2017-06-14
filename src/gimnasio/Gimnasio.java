/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gimnasio;

import controlador.AutenticacionControlador;
import dao.EntrenadorDAO;
import dao.JerarquiaDAO;
import dao.PersonaDAO;
import modelo.Entrenador;
import modelo.Jerarquia;
import modelo.Persona;
import vista.VentanaAutenticacion;

/**
 *
 * @author pseudocfoch
 */
public class Gimnasio {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        AutenticacionControlador autenticacionControlador;
        VentanaAutenticacion ventanaLogin;
        
        ventanaLogin = new VentanaAutenticacion();
        autenticacionControlador = new AutenticacionControlador(ventanaLogin);
        ventanaLogin.agregarControlador(autenticacionControlador);
        ventanaLogin.setVisible(true);
    }
}
