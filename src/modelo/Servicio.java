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
public class Servicio {
    private String IdServicio;
    private String nombSevicio;
    private String descripcion;
    private boolean disponibilidad;
    private float precio;
    
    
    public Servicio(String idServ, String nombServ, String desc, boolean disp, float prec){
        this.IdServicio = idServ;
        this.nombSevicio = nombServ;
        this.descripcion = desc;
        this.disponibilidad = disp;
        this.precio = prec;
    }

    /**
     * @return the IdServicio
     */
    public String getIdServicio() {
        return IdServicio;
    }

    /**
     * @param IdServicio the IdServicio to set
     */
    public void setIdServicio(String IdServicio) {
        this.IdServicio = IdServicio;
    }

    /**
     * @return the nombSevicio
     */
    public String getNombSevicio() {
        return nombSevicio;
    }

    /**
     * @param nombSevicio the nombSevicio to set
     */
    public void setNombSevicio(String nombSevicio) {
        this.nombSevicio = nombSevicio;
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
     * @return the disponibilidad
     */
    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * @param disponibilidad the disponibilidad to set
     */
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
