/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.interfaces.IEntrenadorDAO;
import db.DBConexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Empleado;
import modelo.Entrenador;
import modelo.Jerarquia;
import modelo.Persona;
import modelo.Turno;

/**
 *
 * @author pseudocfoch
 */
public class EntrenadorDAO implements IEntrenadorDAO {
    private static final DBConexion cn = DBConexion.getInstancia();

    private static final String SQL_READ =
            "SELECT idPersona, idJerarquia, nombre, direccion, "
            + "apellidoPaterno, apellidoMaterno, email, distrito, "
            + "fechaNacimiento, telefono, contrasena, idTurno, cargo, sueldo, "
            + "area, horaInicio, horaFin, cuentaBancaria, estadoLaboral, "
            + "especialidad, cantidadMaximaClientes, "
            + "cantidadClientesDisponibles "
            + "FROM Persona "
            + "INNER JOIN Empleado "
            + "ON Persona.idPersona = Empleado.idEmpleado "
            + "INNER JOIN Entrenador  "
            + "ON Entrenador.idEntrenador = Persona.idPersona "
            + "WHERE Entrenador.idEntrenador = ?;";
    private static final String SQL_READ_ALL =
            "SELECT idPersona, idJerarquia, nombre, direccion, "
            + "apellidoPaterno, apellidoMaterno, email, distrito, "
            + "fechaNacimiento, telefono, contrasena, idTurno, cargo, sueldo, "
            + "area, horaInicio, horaFin, cuentaBancaria, estadoLaboral, "
            + "especialidad, cantidadMaximaClientes, "
            + "cantidadClientesDisponibles "
            + "FROM Persona "
            + "INNER JOIN Empleado "
            + "ON Persona.idPersona = Empleado.idEmpleado "
            + "INNER JOIN Entrenador  "
            + "ON Entrenador.idEntrenador = Persona.idPersona;";
    @Override
    public boolean create(Entrenador objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Integer pk) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Entrenador objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Entrenador read(Integer pk) {
        Entrenador entrenador = null;
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ);
            ps.setInt(1, pk);
            
            res = ps.executeQuery();
            while (res.next()) {
                entrenador = _readFromResultSet(res);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return entrenador;
    }
    @Override
    public ArrayList<Entrenador> readAll() {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        try {
            PreparedStatement ps;
            ResultSet res;
            
            ps = cn.getConexion().prepareStatement(SQL_READ_ALL);
            
            res = ps.executeQuery();
            while (res.next()) {
                Entrenador entrenador = _readFromResultSet(res);
                entrenadores.add(entrenador);
            }
        } catch (SQLException ex) {
            Logger.getLogger(JerarquiaDAO.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        return entrenadores;
    }
    
    private Entrenador _readFromResultSet(ResultSet res) throws SQLException {
        Entrenador entrenador;
        
        JerarquiaDAO jerarquiaDAO;
        Jerarquia jerarquia;
        TurnoDAO turnoDAO;
        Turno turno;

        jerarquiaDAO = new JerarquiaDAO();
        jerarquia = jerarquiaDAO.read(res.getInt(2));

        turnoDAO = new TurnoDAO();
        turno = turnoDAO.read(res.getInt(12));

        entrenador = new Entrenador();
        entrenador.setDni(res.getInt(1));
        entrenador.setJerarquia(jerarquia);
        entrenador.setNombre(res.getString(3));
        entrenador.setDireccion(res.getString(4));
        entrenador.setApellidoPaterno(res.getString(5));
        entrenador.setApellidoMaterno(res.getString(6));
        entrenador.setEmail(res.getString(7));
        entrenador.setDistrito(res.getString(8));
        entrenador.setFechaNacimiento(res.getDate(9));
        entrenador.setTelefono(res.getString(10));
        entrenador.setContrasenaEncriptada(res.getString(11));
        entrenador.setTurno(turno);
        entrenador.setcargo(res.getString(13));
        entrenador.setSueldo(res.getFloat(14));            
        entrenador.setArea(res.getString(15));
        entrenador.setHoraInicio(res.getDate(16));
        entrenador.setHoraFin(res.getDate(17));
        entrenador.setCuentaBancaria(res.getString(18));
        entrenador.setEstadoLaboral(res.getString(19));
        entrenador.setEspecialidad(res.getString(20));
        entrenador.setCantidadMaximaClientes(res.getInt(21));
        entrenador.setCantidadClientesDisponibles(res.getInt(22));
        
        return entrenador;
    }
    
}
