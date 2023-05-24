/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cecilia.dao;
import com.cecilia.model.Paciente;
import java.util.List;

/**
 *
 * @author escob
 */
public interface PacienteDAO {
   
    public List <Paciente> findAll();
    
   
    
    public Paciente insert (Paciente objPaciente);
    
    
    
    public Paciente findById(Integer id);
    
    
    public Paciente updateById(Integer id, Paciente objPaciente);
    
    
    public Boolean deleteById(Integer id);
    
    
}
