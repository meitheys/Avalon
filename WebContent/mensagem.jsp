	<%

	try{
		String mensagem = request.getParameter("mensagem");
	
	switch(mensagem){
		case "login":
			out.print("<div id='mensagem'>Usuário ou senha incorretos</div>");
		break;
		
		case "sessao":
			out.print("<div id='mensagem'>Sessão expirada, faça o login novamente</div>");
		break;
		
		case "sair":
			out.print("<div id='mensagem'>Você saiu da Matrix</div>");
		break;
		
		case "compraFeita":
			out.print("");
		break;
	}
	
	}catch(Exception erro){}
	
	%>