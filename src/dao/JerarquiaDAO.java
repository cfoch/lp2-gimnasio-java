/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.interfaces.IJerarquiaDAO;
import dao.utils.IDAO;
import db.DBConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jerarquia;
import modelo.Permiso;

/**
 *
 * @author pseudocfoch
 */
public class JerarquiaDAO implements IJerarquiaDAO {
    private static final String SQL_INSERT =
            "INSERT INTO Jerarquia (descripcion, nombreJerarquia) VALUES (?, ?)";
    private static final String SQL_DELETE =
            "DELETE FROM Jerarquia WHERE idJerarquia = ?";
    private static final String SQL_UPDATE = "UPDATE Jerarquia "
            + "SET descripcion = ? WHERE, nombreJerarquia = ? idJerarquia = ?";
    private static final String SQL_READ = "SELECT "
            + "idJerarquia, descripcion, nombreJerarquia "
            + "FROM Jerarquia WHERE idJerarquia = ?";
    private static final String SQL_READ_ALL = "SELECT * FROM Jerarquia";
    private static final DBConexion cn = DBConexion.getInstancia();
    
    @Override
    public boolean create(Jerarquia objeto) {
        try {
            int id;
            ResultSet ids;
            PreparedStatement ps;
            ps = cn.getConexion().prepareStatement(SQL_INSERT);
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getDescripcion());
                        
            if (ps.executeUpdate() > 0) {
                ids = ps.getGeneratedKeys();
                ids.next();
                id = ids.getInt(1);
                objeto.setId(id);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName())
                    .log(Level.SEVERE, null, ex);
        } finally {
            cn.cerrarConexion();
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            PreparedStatement ps;
            ps = cn.getConexion().prepareStatement(SQL_DELETE);
            ps.setInt(1, id);
            
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
    public boolean update(Jerarquia objeto) {
        try {
            PreparedStatement ps;
            ps = cn.getConexion().prepareStatement(SQL_UPDATE);
            ps.setString(1, objeto.getNombre());
            ps.setString(2, objeto.getDescripcion());
            ps.setInt(3, objeto.getId());

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
    public Jerarquia read(Integer id) {
        Jerarquia jerarquia = null;
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            
            res = ps.executeQuery();
            while (res.next()) {
                jerarquia = new Jerarquia(res.getString(3), res.getString(2));
                jerarquia.setId(res.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return jerarquia;
    }

    @Override
    public ArrayList<Jerarquia> readAll() {
        ArrayList<Jerarquia> jerarquias = new ArrayList<>();
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ_ALL);
            
            res = ps.executeQuery();
            while (res.next()) {
                Jerarquia jerarquia;
                jerarquia = new Jerarquia(res.getString(2), res.getString(3));
                jerarquia.setId(res.getInt(1));
                jerarquias.add(jerarquia);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return jerarquias;
    }
}
