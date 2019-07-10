<%@page import="dao.ProdutoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	
	<%@ include file="topo.jsp" %>
	
		<div id="barraListagem">
			<ul id="lista">		
			</ul>
		</div>
	
	
	<section class="produtosInformatica">
			
		<%
		ProdutoDao pd = new ProdutoDao();
		out.print(pd.selecionarInformatica());
		%>
	
	</section>

</body>

	<%@ include file="footer.jsp" %>

</html>