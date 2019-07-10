<%@page import="dao.ProdutoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%@ include file="topo.jsp" %>

	
	<section class="menu">
		<div>
			<h1>Marcas</h1>
			<hr>
				<a href=TodoLivro.jsp>Todo Livro</a>	<br>
				<a href=Autentica.jsp>Autêntica</a>	<br>
		</div>
	</section>
		
	<section class="produtosLivros">
			
		<% 
		ProdutoDao pd = new ProdutoDao();
		out.print(pd.selecionarLivros());
		%>
		
	</section>
  
</body>

	<%@ include file="footer.jsp" %>

</html>