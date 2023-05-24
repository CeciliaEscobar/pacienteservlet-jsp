<%-- 
    Document   : pacientepost
    Created on : 16 may. 2023, 18:27:43
    Author     : escob
--%>

<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>JSP Page</title>
        <link rel="stylesheet" href="<%=request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/css/bootstrap.min.css"/>
        <script defer src="<%= request.getContextPath() %>/webjars/bootstrap/5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg bg-body-tertiary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">pv</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Paciente</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <h1>Pagina de Registros de Paciente</h1>
        <div class="container">
  
        <form action="<%= request.getContextPath()%>/PacienteServlet?action=create" method="POST">
            <div class="mb-3">
            <label for="nombre" class="form-label"> Nombre:</label> 
                    <input type="text" class="form-control"  name="nombre" id="nombre" required minlength="1" maxlength="100" placeholder="Nombre del Paciente">
                </div>
                <div class="mb-3">
                    <label for="apellido" class="form-label">Edad:</label>
                    <input type="text" class="form-control" name="edad" id="edad" required minlength="1" maxlength="100" placeholder="Edad del paciente"/>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Estrato:</label>
                    <input type="text" class="form-control" name="estrato" id="estrato" required minlength="6" maxlength="50" placeholder="Estrato del paciente"/>
                </div>
                <div class="mb-3">
                    <label for="descripcion" class="form-label" >Acudiente:</label>
                    <input type="text" class="form-control" name="acudiente" id="acudiente" required minlength="1" maxlength="100" placeholder="Acudiente"/>
                </div>
                <button type="submit" class="btn btn-primary">Registrar</button>
            </form>
        </div>

            </body>
</html>

