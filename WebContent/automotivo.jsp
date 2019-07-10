<%@page import="dao.ProdutoDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
	<%@ include file="topo.jsp" %>

	<section class="menu">
		<div>
			<h1>Marcas</h1>
			<hr>
				<a href=7DRIVER.jsp>7DRIVER</a>	<br>
				<a href=Moto.jsp>Moto III</a>	<br>
				<a href=MultiGear.jsp>MultiGear</a>	<br>
				<a href=Delinte.jsp>Delinte</a>	<br>
				<a href=JBL.jsp>JBL</a>  <br>
		</div>
	</section>
	
	<section class="produtosAutomotivos">		
		
		<% 
		ProdutoDao pd = new ProdutoDao();
		out.print(pd.selecionarAutomotivo());
		%>
		
	</section>

</body>

	<%@ include file="footer.jsp" %>

</html>
