/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author pseudocfoch
 */
public class Turno {
    private int id;
    private String descripcion;
    private String nombreTurno;

    public Turno(String nombreTurno, String descripcion) {
        this.descripcion = descripcion;
        this.nombreTurno = nombreTurno;
    }
   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
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
     * @return the nombreTurno
     */
    public String getNombreTurno() {
        return nombreTurno;
    }

    /**
     * @param nombreTurno the nombreTurno to set
     */
    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }


}
