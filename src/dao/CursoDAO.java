/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import modelo.Curso;
import dao.interfaces.ICursoDAO;
import db.DBConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alulab14
 */
public class CursoDAO implements ICursoDAO{
    private static final String SQL_READ =
            "SELECT * FROM Curso WHERE idCurso = ?";
    private static final String SQL_READ_ALL = "SELECT * FROM Curso";
    private static final DBConexion cn = DBConexion.getInstancia();
    
   
    @Override
    public Curso read(Integer id) {
        Curso curso=null;
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, id);
            
            res = ps.executeQuery();
            while (res.next()) {
                curso=new Curso();
                curso.setId(res.getInt(1));
                curso.setNombre(res.getString(2));
                curso.setDescripcion(res.getString(3));
            }
        }catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return curso;
    }
    
    @Override
    public ArrayList<Curso>readAll(){
        ArrayList<Curso>cursos;
        cursos=new ArrayList<>();
        try{
            PreparedStatement ps;
            ResultSet res;
            Curso curso;
            ps = cn.getConexion().prepareStatement(SQL_READ_ALL);
            
            res = ps.executeQuery();
            while (res.next()) {
                curso=new Curso();
                curso.setId(res.getInt(1));
                curso.setNombre(res.getString(2));
                curso.setDescripcion(res.getString(3));
                cursos.add(curso);
            }
        }catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return cursos;
    }

    @Override
    public boolean create(Curso objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Curso objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
