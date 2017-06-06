/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.utils.IDAO;
import db.DBConexion;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jerarquia;
import modelo.Persona;
import dao.interfaces.IPersonaDAO;

/**
 *
 * @author pseudocfoch
 */
public class PersonaDAO implements IPersonaDAO {
    private static final String SQL_INSERT = "INSERT INTO Persona "
            + "(idPersona, idJerarquia, nombre, direccion, "
            + "apellidoPaterno, apellidoMaterno, email, distrito, "
            + "fechaNacimiento, telefono, contrasena) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE =
            "DELETE FROM Persona WHERE idPersona = ?";
    private static final String SQL_UPDATE = "UPDATE Persona "
            + "SET idJerarquia = ?, nombre = ?, direccion = ?, "
            + "apellidoPaterno = ?, apellidoMaterno = ?, "
            + "email = ?, distrito = ?, fechaNacimiento = ?, telefono = ?, "
            + "contrasena = ? WHERE idPersona = ?";
    private static final String SQL_READ =
            "SELECT * FROM Persona WHERE idPersona = ?";
    private static final String SQL_READ_ALL = "SELECT * FROM Persona";
    private static final DBConexion cn = DBConexion.getInstancia();

    @Override
    public boolean create(Persona objeto) {
        try {
            int id;
            ResultSet ids;
            PreparedStatement ps;
            ps = cn.getConexion().prepareStatement(SQL_INSERT);
            ps.setInt(1, objeto.getDni());
            ps.setInt(2, objeto.getJerarquia().getId());
            ps.setString(3, objeto.getNombre());
            ps.setString(4, objeto.getDireccion());
            ps.setString(5, objeto.getApellidoPaterno());
            ps.setString(6, objeto.getApellidoMaterno());
            ps.setString(7, objeto.getEmail());
            ps.setString(8, objeto.getDistrito());
            ps.setDate(9, (Date) objeto.getFechaNacimiento());
            ps.setString(10, objeto.getTelefono());
            ps.setString(11, objeto.getContrasena());
            if (ps.executeUpdate() > 0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean delete(Integer dni) {
        try {
            PreparedStatement ps;
            ps = cn.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, dni);
            
            if (ps.executeUpdate() > 0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean update(Persona objeto) {
        try {
            PreparedStatement ps;
            ps = cn.getConexion().prepareStatement(SQL_UPDATE);
            ps.setInt(1, objeto.getJerarquia().getId());
            ps.setString(2, objeto.getNombre());
            ps.setString(3, objeto.getDireccion());
            ps.setString(4, objeto.getApellidoPaterno());
            ps.setString(5, objeto.getApellidoMaterno());
            ps.setString(6, objeto.getEmail());
            ps.setString(7, objeto.getDistrito());
            ps.setDate(8, (Date) objeto.getFechaNacimiento());
            ps.setString(9, objeto.getTelefono());
            ps.setString(10, objeto.getContrasena());
            
            ps.setInt(11, objeto.getDni());

            
            if (ps.executeUpdate() > 0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
        }
        return false;
    }

    @Override
    public Persona read(Integer id) {
        Persona persona = null;
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            
            res = ps.executeQuery();
            while (res.next()) {
                JerarquiaDAO jerarquiaDAO;
                Jerarquia jerarquia;
                
                jerarquiaDAO = new JerarquiaDAO();
                jerarquia = jerarquiaDAO.read(res.getInt(2));
                
                persona = new Persona();
                persona.setDni(res.getInt(1));
                persona.setJerarquia(jerarquia);
                persona.setNombre(res.getString(3));
                persona.setApellidoPaterno(res.getString(4));
                persona.setApellidoMaterno(res.getString(5));
                persona.setDireccion(res.getString(6));
                persona.setEmail(res.getString(7));
                persona.setDistrito(res.getString(8));
                persona.setFechaNacimiento(res.getDate(9));
                persona.setTelefono(res.getString(10));
                persona.setContrasenaEncriptada(res.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return persona;
    }

    @Override
    public ArrayList<Persona> readAll() {
        ArrayList<Persona> personas;
        personas = new ArrayList<>();
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ_ALL);
            
            res = ps.executeQuery();
            while (res.next()) {
                Persona persona;
                JerarquiaDAO jerarquiaDAO;
                Jerarquia jerarquia;
                
                // FIXME
                // No estoy seguro si aca puede haber un conflicto entre
                // los hilos de la conexion.
                jerarquiaDAO = new JerarquiaDAO();
                jerarquia = jerarquiaDAO.read(res.getInt(2));
                
                persona = new Persona();
                persona.setDni(res.getInt(1));
                persona.setJerarquia(jerarquia);
                persona.setNombre(res.getString(3));
                persona.setDireccion(res.getString(4));
                persona.setApellidoPaterno(res.getString(5));
                persona.setApellidoMaterno(res.getString(6));
                persona.setEmail(res.getString(7));
                persona.setDistrito(res.getString(8));
                persona.setFechaNacimiento(res.getDate(9));
                persona.setTelefono(res.getString(10));
                persona.setContrasenaEncriptada(res.getString(11));
                personas.add(persona);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return personas;
    }
}
