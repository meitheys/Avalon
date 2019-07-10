<%@page import="beans.UsuarioBean"%>
<%@page import="dao.UsuarioDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%
    
    //Obter email e senha
    String Usuario = request.getParameter("usuario");
    String Senha = request.getParameter("senha");

    //Validar o email e senha
    UsuarioDao ud = new UsuarioDao();
    int contador = ud.validarLogin(Usuario, Senha);
    out.print(contador);
    
    //Condicional
     if(contador == 0){
    	response.sendRedirect("../Cadastro.jsp?mensagem=login");   
    }else{
    	UsuarioBean ub = ud.obterDados(Usuario, Senha);
    	session.setAttribute("Usuario", ub);
    	response.sendRedirect("../transporte.jsp");    	
    }  
    %>