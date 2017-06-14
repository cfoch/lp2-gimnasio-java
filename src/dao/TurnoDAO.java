/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.interfaces.ITurnoDAO;
import db.DBConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jerarquia;
import modelo.Turno;

/**
 *
 * @author pseudocfoch
 */
public class TurnoDAO implements ITurnoDAO {
    private static final DBConexion cn = DBConexion.getInstancia();
    private static final String SQL_READ =
            "SELECT idTurno, descripcion, nombreTurno "
            + "FROM Turno "
            + "WHERE idTurno = ?";

    @Override
    public boolean create(Turno objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Turno objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Turno read(Integer pk) {
        Turno turno = null;
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, pk);
            
            res = ps.executeQuery();
            while (res.next()) {
                turno = new Turno(res.getString(3), res.getString(2));
                turno.setId(res.getInt(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return turno;
    }

    @Override
    public ArrayList<Turno> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
