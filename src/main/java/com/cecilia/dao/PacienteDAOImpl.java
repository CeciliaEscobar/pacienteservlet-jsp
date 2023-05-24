/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cecilia.dao;

import com.cecilia.config.Conexion;
import com.cecilia.model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author escob
 */
public class PacienteDAOImpl implements PacienteDAO{
    
    private Conexion objConexion;
    
    private Connection objConnection;
    
    public PacienteDAOImpl(){
    objConexion = new Conexion();
    }

    @Override
    public List<Paciente> findAll() {
         
        String consulta = "SELECT * FROM pacientes";
        //listado de datos que se retorna
        List<Paciente> listado = new LinkedList<>();
        
        try{
           this.objConexion.conectar();
           this.objConnection = this.objConexion.getJdbcConnection();
         
           PreparedStatement prest = this.objConnection.prepareStatement(consulta);
            
          
           ResultSet rs = prest.executeQuery(consulta);
           
           Paciente objPaciente;
           
           while(rs.next()){
               objPaciente = new Paciente();
               objPaciente.setId(rs.getInt("id"));
               objPaciente.setNombre(rs.getString ("nombre"));
               objPaciente.setEdad(rs.getString ("edad"));
               objPaciente.setEstrato(rs.getString ("estrato"));
               objPaciente.setAcudiente(rs.getString ("acudiente"));
               
               listado.add(objPaciente);
               
           }
           
        }catch(Exception e){
            System.out.println("Error en la consulta");
        }
        return listado;
    }

    @Override
    public Paciente insert(Paciente objPaciente) {
        String consulta = "INSERT INTO pacientes(nombre, edad, estrato, acudiente) VALUES(?,?,?,?)";
        try{
            this.objConexion.conectar();
            this.objConnection = this.objConexion.getJdbcConnection();
         
            PreparedStatement prest = this.objConnection.prepareStatement(consulta);
       
           
           prest.setString(1 , objPaciente.getNombre());
           prest.setString(2, objPaciente.getEdad());
           prest.setString(3 , objPaciente.getEstrato());
           prest.setString(4 , objPaciente.getAcudiente());
           
           
           int count = prest.executeUpdate();
           
           ResultSet rs = null;
           rs = prest.executeQuery("SELECT LAST_INSERT_ID()");
           
           int autoKey = -1;
           if(rs.next()){
               autoKey = rs.getInt("id");
               objPaciente.setId(autoKey);
               System.out.println("Ultimo ID introducido" + autoKey);
           }else{
               System.out.println("No existe dato de ID");
           }
           
            
        }catch(Exception e){
            System.out.println("Error al insertar" + e);
        }
        return objPaciente;
    }

    @Override
    public Paciente findById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Paciente updateById(Integer id, Paciente objPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean deleteById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
