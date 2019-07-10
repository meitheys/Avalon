<%@page import="beans.UsuarioBean"%>
<%@page import="dao.UsuarioDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%
    
    //Obter email e senha
    String Usuario = request.getParameter("usuario");
    String Senha = request.getParameter("senha");
    String Email = request.getParameter("email");
    String CPF = request.getParameter("cpf");
    
    UsuarioDao ud = new UsuarioDao();
    UsuarioBean ub = new UsuarioBean();

    ud.cadastrar(Usuario, Senha, Email, CPF);
    
    
    %>