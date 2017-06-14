/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import dao.interfaces.IEmpleadoDAO;
import java.util.ArrayList;
import modelo.Empleado;

/**
 *
 * @author pseudocfoch
 */
public class EmpleadoDAO implements IEmpleadoDAO {
    String SQL_INSERT;
    String SQL_DELETE;
    String SQL_UPDATE;
    String SQL_READ;
    String SQL_READ_ALL;
    
    @Override
    public boolean create(Empleado objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Empleado objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado read(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Empleado> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
