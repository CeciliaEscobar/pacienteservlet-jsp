<%-- 
    Document   : pacienteget
    Created on : 16 may. 2023, 18:28:17
    Author     : escob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pagina de Registro del Paciente</h1>
        <form action="<%= request.getContextPath()%>/PacienteServlet" method="GET">
            <label>Nombre:</label>
            <input type="text" name="nombre">
            <br> 
            <label>Edad:</label>
            <input type="text" name="edad">
            <br>
            <label>Estrato:</label>
            <input type="text" name="estrato">
            <br>
            <label>Acudiente:</label>
            <input type="text" name="acudiente">
            <br>
            <input type="submit" value="Registrar">
        </form>
    </body>
</html>

