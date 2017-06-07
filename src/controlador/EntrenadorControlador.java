/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.EntrenadorDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Entrenador;
import modelo.Persona;
import vista.VentanaEntrenador;

/**
 *
 * @author pseudocfoch
 */
public class EntrenadorControlador implements ActionListener {
    private ArrayList<Entrenador> entrenadores;
    private VentanaEntrenador vista;
    private Persona persona;
    
    public EntrenadorControlador(Persona persona, VentanaEntrenador vista) {
        this.vista = vista;
        this.persona = persona;
        this.refrescar();
    }

    public void refrescar() {
        ArrayList<Entrenador> entrenadores;
        int i;
        vista.borrar();
        entrenadores = getEntrenadores();
        for (i = 0; i < entrenadores.size(); i++) {
            Entrenador entrenador;
            entrenador = entrenadores.get(i);
            System.out.println(entrenador.getSueldo());
            Object datos[] = {
                String.valueOf(entrenador.getDni()),
                entrenador.getNombre(),
                entrenador.getApellidoPaterno(),
                entrenador.getApellidoMaterno(),
                String.valueOf(entrenador.getSueldo())
            };
            this.getVista().agregarDatos(datos);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd;        
        cmd = e.getActionCommand();
        if (cmd.equals(VentanaEntrenador.Action.REFRESCAR_BUTTON_CLICKED)) {
            this.refrescar();
        }

    }

    /**
     * @return the entrenadores
     */
    public ArrayList<Entrenador> getEntrenadores() {
        EntrenadorDAO dao;
        dao = new EntrenadorDAO();
        return dao.readAll();
    }
    
    /**
     * @return the vista
     */
    public VentanaEntrenador getVista() {
        return vista;
    }    
    
}
