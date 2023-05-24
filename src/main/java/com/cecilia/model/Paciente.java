/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cecilia.model;

/**
 *
 * @author escob
 */
public class Paciente {
    //atributos del modelo
    private Integer id;
    private String nombre;
    private String edad;
    private String estrato;
    private String acudiente;
    
    //constructor vacio
    
    public Paciente(){
        
    }
    
    //getters y setters
    
     public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
     
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    
    public void setEdad(String edad){
        this.edad = edad;
    }
    public String getEdad(){
        return edad;
    }
    
     public void setEstrato(String estrato){
        this.estrato = estrato;
    }
    public String getEstrato(){
        return estrato;
    }
    
      public void setAcudiente(String acudiente){
        this.acudiente= acudiente;
    }
    public String getAcudiente(){
        return acudiente;
    }
     
}

