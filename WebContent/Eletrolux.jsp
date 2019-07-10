<%@page import="dao.ProdutoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

	<%@ include file="topo.jsp" %>
	
	<section class="menu">
		<div>
			<h1>Marcas</h1>
			<hr>
				<a href=RefrigeraMAX.jsp>MAX</a>	<br>
				<a href=Eletrolux.jsp>Eletrolux</a>	<br>
				<a href=Brastemp.jsp>Brastemp</a>	<br>
		</div>
	</section>
		
	<section class="produtosEletrodomesticos">		
	
		<% 
		ProdutoDao pd = new ProdutoDao();
		out.print(pd.selecionarEletrolux());
		%>
		
	</section>
				
</body>

	<%@ include file="footer.jsp" %>

</html>