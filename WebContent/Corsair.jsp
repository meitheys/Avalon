<%@page import="dao.ProdutoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

	<%@ include file="topo.jsp" %>

	<section class="menu">
		<div>
			<h1>Marcas</h1>
			<hr>
				<a href=Xiaomi.jsp>Xiaomi</a>	<br>
				<a href=Samsung.jsp>Samsung</a>	<br>
				<a href=Razer.jsp>Razer</a>	<br>
				<a href=EVGA.jsp>EVGA</a>	<br>
				<a href=Corsair.jsp>Corsair</a>  <br>
		</div>
	</section>
		
	<section class="produtos">
	
		<% 
		ProdutoDao pd = new ProdutoDao();
		out.print(pd.selecionarCorsair());
		%> 
		
	</section>

</body>

	<%@ include file="footer.jsp" %>

</html>