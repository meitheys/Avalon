	<%

	try{
		String mensagem = request.getParameter("mensagem");
	
	switch(mensagem){
		case "login":
			out.print("<div id='mensagem'>Usu�rio ou senha incorretos</div>");
		break;
		
		case "sessao":
			out.print("<div id='mensagem'>Sess�o expirada, fa�a o login novamente</div>");
		break;
		
		case "sair":
			out.print("<div id='mensagem'>Voc� saiu da Matrix</div>");
		break;
		
		case "compraFeita":
			out.print("");
		break;
	}
	
	}catch(Exception erro){}
	
	%>