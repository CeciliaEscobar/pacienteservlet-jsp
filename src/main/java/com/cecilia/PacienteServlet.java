/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cecilia;

import com.cecilia.dao.PacienteDAO;
import com.cecilia.dao.PacienteDAOImpl;
import com.cecilia.model.Paciente;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author escob
 */

@WebServlet(urlPatterns="/PacienteServlet")
public class PacienteServlet extends HttpServlet {
    
    private PacienteDAO pacienteDao;
    
    public PacienteServlet(){
        
        super();
        pacienteDao = new PacienteDAOImpl();
    }
    
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.procesarSolicitud(req, resp);
        
    }
    
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      this.procesarSolicitud(req, resp);
        
    }
    
    protected void procesarSolicitud(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        switch (request.getParameter("action")){
            case "list":
                //this.list(request,response);
                break;
              case "create":
                this.create(request,response);
                break;
                 case "read":
                //this.read(request,response);
                break;
                 case "update":
                //this.update(request,response);
                break;
                 case "delete":
                //this.delete(request,response);
                break;
                 case "showRegister":
                this.showRegister(request,response);
                break;
                 case "index":
                this.index(request,response);
                break;
                default:
                  this.index(request,response);
                break;
                
        }
        
       
    }
     private void index (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
            dispatcher.forward(request, response);
        }
     private void showRegister(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
          RequestDispatcher dispatcher = request.getRequestDispatcher("/view/create.jsp");
            dispatcher.forward(request, response);
     }
      private void create (HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
          
          String name = request.getParameter("nombre");
          String edad = request.getParameter("edad");
          String estrato = request.getParameter("estrato");
          String acudiente = request.getParameter("acudiente");
          
          
          
          Paciente objPaciente = new Paciente();
          objPaciente.setNombre(name);
          objPaciente.setEdad(edad);
          objPaciente.setEstrato(estrato);
          objPaciente.setAcudiente(acudiente);
          
          pacienteDao.insert(objPaciente);
          
          
          
          this.index(request, response);
     }
}
